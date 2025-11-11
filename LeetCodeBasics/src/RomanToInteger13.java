
public class RomanToInteger13 {
	class Solution {
		public static int romanToInt(String s) {
			int romanToInt = 0;
			int Ivalue = 1;
			int Vvalue = 5;
			int Xvalue = 10;
			int Lvalue = 50;
			int Cvalue = 100;
			int Dvalue = 500;
			int Mvalue = 1000;

			char Roman = 0;
			char prevRoman = 0;
			for (int i = s.length() - 1; i >= 0; i--) {
				Roman = s.charAt(i);
				if (Roman == 'I') {
					if (prevRoman == 'V' || prevRoman == 'X') {
						romanToInt -= Ivalue;
					} else {
						romanToInt += Ivalue;
					}
				} else if (Roman == 'V') {
					romanToInt += Vvalue;
				} else if (Roman == 'X') {
					if (prevRoman == 'L' || prevRoman == 'C') {
						romanToInt -= Xvalue;
					} else {
						romanToInt += Xvalue;
					}
				} else if (Roman == 'L') {
					romanToInt += Lvalue;
				} else if (Roman == 'C') {
					if (prevRoman == 'D' || prevRoman == 'M') {
						romanToInt -= Cvalue;
					} else {
						romanToInt += Cvalue;
					}
				} else if (Roman == 'D') {
					romanToInt += Dvalue;
				} else if (Roman == 'M') {
					romanToInt += Mvalue;
				}
				prevRoman = Roman;
			}
			return romanToInt;
		}
	}

	public static void main(String[] args) {
		String example1 = "III";
		String example2 = "LVIII";
		String example3 = "MCMXCIV";

		System.out.println("example input 1: " + example1 + " = " + Solution.romanToInt(example1));
		System.out.println("example input 2: " + example2 + " = " + Solution.romanToInt(example2));
		System.out.println("example input 3: " + example3 + " = " + Solution.romanToInt(example3));
	}

}
