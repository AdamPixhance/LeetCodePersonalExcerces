
public class PlusOne66 {
	// start of solution
	class Solution {
		public int[] plusOne(int[] digits, int index) {
			// the simple case, when the digit is not a 9
			if (digits[index] != 9) {
				digits[index] += 1;
				return digits;
			}
			// the complicated case, when its the last digit && a 9
			if (index == 0) {
				int[] tempDigits = new int[digits.length + 1];
				tempDigits[0] = 1;
				tempDigits[1] = 0;
				for (int x = 2; x < tempDigits.length; x++) {
					tempDigits[x] = digits[x - 1];
				}
				return tempDigits;
			}
			// the case, when its a 9, but not at the start of the array
			digits[index] = 0;
			return plusOne(digits, index - 1);
		}

		public int[] plusOne(int[] digits) {
			int i = digits.length - 1;
			return plusOne(digits, i);
		}
	}
	// end of solution
}
