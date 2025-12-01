
// 28. Find the Index of the First Occurrence in a String
public class FindTheIndexOfTheFirstOccurrenceInAString28 {
	// debugging main method
	public static void main(String[] args) {
		System.out.println(Solution.strStr("sadbutsad", "sad"));
	}

	class Solution {
		public static int strStr(String haystack, String needle) {
			int needleLength = needle.length();
			for (int i = 0; i <= haystack.length() - needleLength; i++) {
				if (haystack.substring(i, i + needleLength).equals(needle)) {
					return i;
				}
			}
			return -1;
		}
	}

}
