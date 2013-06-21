def isPalindromeNum(x):
	if (x < 0):
		return False

	if (x == 0):
		return True

	div = 1
	while x / div >= 10:
		div = div * 10
	print("div = %d" % div)

	while x != 0:
		l = int(x / div)
		r = x % 10
		if l != r:
			return False

		x = int((x % div) / 10)
		div = int(div / 100)
	return True

print(isPalindromeNum(121))