
public class SearchInsertPosition35 {
	// main method for local debugging
	public static void main(String[] args) {
		int[] nums1 = { 1, 3, 5, 6 };
		int target1 = 5;
		int target2 = 2;
		int target3 = 7;
		int output1 = Solution.searchInsert(nums1, target1);
		int output2 = Solution.searchInsert(nums1, target2);
		int output3 = Solution.searchInsert(nums1, target3);
		System.out.println("The output from target-1 was: " + output1 + ".");
		System.out.println("The output from target-2 was: " + output2 + ".");
		System.out.println("The output from target-3 was: " + output3 + ".");

	}

	// LeetCode Solution starts here
	class Solution {

		public static int searchInsert(int[] nums, int target) {
			int left = 0;
			int right = nums.length - 1;

			while (left <= right) {
				int mid = left + ((right - left) / 2);
				if (nums[mid] == target ) {
					return mid;
				} else if (nums[mid] < target) {
					left = mid+1;
				} else {
					right = mid -1;
				}
			}
			return left;
		}
	}
	// LeetCode Solution ends here
}
