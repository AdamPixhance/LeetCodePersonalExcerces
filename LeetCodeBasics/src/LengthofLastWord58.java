
public class LengthofLastWord58 {
	class Solution {
		public int lengthOfLastWord(String s) {
			s = s.strip();
			boolean whitespace = false;
			int counter = 0;
			for (int i = s.length() - 1; i >= 0; i--) {
				if (Character.isWhitespace(s.charAt(i))) {
					whitespace = true;
					break;
				} else {
					counter ++;
				}
			}
			if (whitespace == false) {
				return s.length();
			}
			return counter;
		}
	}
}
