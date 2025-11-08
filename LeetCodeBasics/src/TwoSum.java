import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputNums = {1,2,3};
		int inputTarget = 4;
		System.out.println(Arrays.toString(Solution.twoSum(inputNums, inputTarget)));
		
	}
	
	class Solution {
	    public static int[] twoSum(int[] nums, int target) {
	        int result[] = {0,0};
	        int numsLength = nums.length;
	        for (int x = 0; x < numsLength; x++) {
	        	for (int y = x+1; y < numsLength; y++) {
	        		if (nums[x] + nums[y] == target) {
	        			result[0] = x;
	        			result[1] = y;
	        			return result;
	        		}
	        	}
	        }
	        return result;
	    }
	}

}
