
public class RansomNoteClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransomNote = "aab";
		String magazine = "baa";
		System.out.println(Solution.canConstruct(ransomNote, magazine));

	}

	class Solution {
		static public boolean canConstruct(String ransomNote, String magazine) {

			int ransomLength = ransomNote.length();
			int magLength = magazine.length();
			StringBuilder myMagazine = new StringBuilder(magazine);
			boolean canConstruct = true;
			for (int r = 0; r < ransomLength; r++) {
				boolean constructLetter = false;
				for (int m = 0; m < magLength; m++) {
					if (ransomNote.charAt(r) == myMagazine.charAt(m)) {
						myMagazine.setCharAt(m, '0');
						constructLetter = true;
						break;
					}

				}
				if (constructLetter == false) {
					canConstruct = false;
					break;
				}
			}

			return canConstruct;
		}
	}

}
