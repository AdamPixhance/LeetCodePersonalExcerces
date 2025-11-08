import java.util.Arrays;

public class RunningSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputNums = {4,5,6};
		int[] resultArray = (Solution.runningSum(inputNums));
		System.out.println(Arrays.toString(resultArray));
		

	}
	
	class Solution {
	    public static int[] runningSum(int[] nums) {
	        int[]  runningSum = nums;
	        int length = nums.length;
	        for (int i = 0; i < length-1; i++) {
	        	nums[i+1] += nums[i];
	        }
	        
	        return runningSum;
	    }
	}

}
