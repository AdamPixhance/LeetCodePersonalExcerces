public class RemoveDuplicatesfromSortedArray26 {
	class Solution {
		public static int removeDuplicates(int[] nums) {
			int k = 1;
			if (nums.length == 0) {
				return 0;
			}
			if (nums.length == 1) {
				return 1;
			}
			int current = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] > nums[current]) {
					nums[current + 1] = nums[i];
					current++;
					k++;
				}
			}
			return k;
		}
	}
}