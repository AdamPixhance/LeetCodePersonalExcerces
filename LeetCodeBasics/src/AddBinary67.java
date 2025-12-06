import java.util.Arrays;

public class AddBinary67 {
	// main method just for debugging
	public static void main(String[] args) {
		String a = "100";
		String b = "110010";
		System.out.println(Solution.addBinary(a, b));
	}
	// Really unhappy with this solution
	// start of solution
	class Solution {
		//custom method to check for 0s
		public static boolean hasOnlyZeros(String x) {
			if (Character.getNumericValue(x.charAt(0)) != 1){
				return true;
			}
			return false;
		}
		// custom method to return int Arrays
		public static int[] stringToArray(String x, int length) {
			int[] stringToArray = new int[length + 1];
			int delta = stringToArray.length - x.length();
			for (int i = stringToArray.length - 1; i >= delta; i--) {
				stringToArray[i] = Character.getNumericValue(x.charAt(i - delta));
			}
			return stringToArray;
		}

		// custom adding method for each index
		public static int[] addedIndex(int[] a, int fromB, int index) {
			// the case of adding a 0 index, nothing changes
			if (fromB == 0) {
				return a;
			}
			// check for the first 0, and change it to 1
			while (a[index] == 1) {
				a[index] = 0;
				index--;
			}
			a[index] = 1;
			return a;
		}

		// creating an sortedAdd method for sorted binary strings
		public static String sortedAdd(String a, String b) {
			if (hasOnlyZeros(b)) {
				return a;
			}
			if (hasOnlyZeros(a)) {
				return b;
			}
			// creating arrayA as is
			int[] arrayA = stringToArray(a, a.length());
			// creating arrayB with leading 0s
			int[] arrayB = stringToArray(b, a.length());
			// begin adding
			for (int i = arrayA.length - 1; i >= 0; i--) {
				arrayA = addedIndex(arrayA, arrayB[i], i);
			}
			if (arrayA[0] == 1) {
				return (Arrays.toString(arrayA));
			}
			return (Arrays.toString(arrayA).substring(2));
		}

		// the main loop the returns the solution
		public static String addBinary(String a, String b) {

			if (a.length() >= b.length()) {
				return sortedAdd(a, b).replaceAll("\\[|\\]|,|\\s", "");
			}
			return sortedAdd(b, a).replaceAll("\\[|\\]|,|\\s", "");
		}
	}
	// end of solution
}
