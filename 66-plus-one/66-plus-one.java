class Solution {
    public int[] plusOne(int[] digits) {
	int[] oneMore = new int[digits.length + 1];
	digits[digits.length - 1]++;
	for (int i = digits.length - 1; i >= 0; i--) {
		int digit = digits[i];
		digits[i] = digit % 10;
		oneMore[i + 1] = digits[i];

		if (digit > 9) {
			if (i > 0) {
				digits[i - 1]++;
			} else {
				oneMore[0] = 1;
				return oneMore;
			}
		}
	}
	return digits;
}
}