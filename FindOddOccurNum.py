from functools import reduce
import os

def getOdd(arr):
	return reduce(lambda x, y: x^y, arr)

def isDigit(c):
	if '0' <= c <= '9':
		return True

	return False

def evalRPN(exp):
	if not exp:
		return 0
	
	stack = []
	for i in range(0, len(exp)):
		if isDigit(exp[i]):
			stack.append(int(exp[i]))
		else:
			op2 = stack.pop()
			op1 = stack.pop()
			res = 0

			if exp[i] == '+':
				res = op1 + op2
			if exp[i] == '-':
				res = op1 - op2
			if exp[i] == '*':
				res = op1 * op2
			if exp[i] == '/':
				res = op1 / op2

			stack.append(res)

	return stack.pop()

exp = ['5', '1', '2', '+', '4', '*', '+', '3', '-']
print(evalRPN(exp))


