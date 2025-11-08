
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 101;
		System.out.println(Solution.isPalindrome(x));

	}

	class Solution {
		static public boolean isPalindrome(int x) {
			boolean isPalindrome = false;
			if (x == 0) {
				return true;
			} else if (x < 0) {
				return false;
			} else if (x < 10) {
				return true;
			} else {
				String myX = Integer.toString(x);
				String firstHalf = "";
				String secondHalf = "";
				for (int i = 0; i < (myX.length() / 2); i++) {
					firstHalf += myX.charAt(i);
					secondHalf = myX.charAt(i) + secondHalf;
				}
				if (myX.length()%2 == 0) {
					isPalindrome = Integer.parseInt(firstHalf+secondHalf) == x;
				} else {
					char Bridge = myX.charAt((myX.length()/2));
					isPalindrome = Integer.parseInt(firstHalf+ Bridge +secondHalf) == x;
				}
				
			}
			return isPalindrome;
		}
	}
}