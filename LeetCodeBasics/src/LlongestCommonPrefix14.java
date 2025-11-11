import java.util.ArrayList;

public class LlongestCommonPrefix14 {

	public static void main(String[] args) {
		String[] strs1 = { "flower", "flow", "flight" };
		String[] strs2 = { "dog", "racecar", "car" };
		String[] strs3 = {""};

		System.out.println("Test example 1 strs: " + Solution.longestCommonPrefix(strs1));
		System.out.println("Test example 2 strs: " + Solution.longestCommonPrefix(strs2));
		System.out.println("Test example 3 strs: " + Solution.longestCommonPrefix(strs3));
	}

	class Solution {
		public static String longestCommonPrefix(String[] strs) {

			ArrayList<Character> commonPrefix = new ArrayList<Character>();
			if (strs.length == 0) {
				return "";
			} else if (strs.length == 1) {
				return strs[0];
			}

			int minLength = 201;
			for (int i = 0; i < strs.length; i++) {
				if (strs[i].length() < minLength) {
					minLength = strs[i].length();
				}
			}
			if (minLength == 0) {
				return "";
			}
			for (int i = 0; i < minLength; i++) {
				char tempCharCompare = strs[0].charAt(i);
				for (int x = 0; x < strs.length; x++) {
					if (strs[x].charAt(i) != tempCharCompare) {
						String longestCommonPrefix = "";
						for (int c = 0; c < commonPrefix.size(); c++) {
							longestCommonPrefix += Character.toString(commonPrefix.get(c));
						}
						return longestCommonPrefix;
					}
				}
				commonPrefix.add(tempCharCompare);
			}

			String longestCommonPrefix = "";
			for (int c = 0; c < commonPrefix.size(); c++) {
				longestCommonPrefix += Character.toString(commonPrefix.get(c));
			}
			return longestCommonPrefix;
		}
	}

}
