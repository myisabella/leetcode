/*
 * Implement atoi to convert a string to an integer.
 * Requirements:
 * 1) discards as many whitespace chars as necessary until first non-whitespace
 *    char is found;
 * 2) consider optional initial plus or minus sign
 * 3) the string can contain additional chars after those that form the integral
 *	  number, which are ignored and have no effect on this function
 * 4) If the first char of non-whitespace is not a valid digit number, or no
 *    such sequence exists, no conversion is performed;
 * 5) If no valid conversion could be performed, a zero value is returned;
 * 6) If the correct value is out of range, INT_MAX or INT_MIN is returned.
 */


#include <stdio.h>
#include <ctype.h>
#include <limits.h>

int atoi(const char *str) {
	assert(str != NULL);

	while (isspace(*str)) {
		str++;
	}

	int sign = (*str == '-') ? -1 : 1;
	if (*str == '-' || *str == '+') {
		str++;
	}

	int res = 0;
	while (isdigit(*str)) {
		int digit = *str - '0';

		if (INT_MAX/10 >= res) {
			res *= 10;
		} else {
			return sign == -1 ? INT_MIN : INT_MAX;
		}

		if (INT_MAX - digit >= res) {
			res += digit;
		} else {
			return sign == -1 ? INT_MIN : INT_MAX;
		}

		str++;
	}

	return res * sign;
}

int main(void) {
	char str[] = "345";
	print("The result: %d\n", atoi(str));

	return 0;
}