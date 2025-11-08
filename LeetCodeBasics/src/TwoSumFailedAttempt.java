import java.util.Arrays;
import java.util.ArrayList;

public class TwoSumFailedAttempt {

	public static void main(String[] args) {
		int InputArray[] = {3,3,0,4,6,2,0,8,5,6,7,8,12,14,16,167};
		int target = 169;
		System.out.print(Arrays.toString (Solution.twoSum (InputArray, target)));
	}
	
	
	class Solution {
	    public static int[] twoSum(int[] nums, int target) {
	    	ArrayList<Integer> output = new ArrayList<Integer>();
	        int[] finalOutput = null;
	        int terminate = 0;
	        int skip = 0;
	        for (int i = (nums.length-1); i >=0; i--) {
	        	if ( nums[i] == 0 ) {
	                output.add(i);
	                int[] SolvedOutput = output.stream().mapToInt(Integer::intValue).toArray();
	                finalOutput = SolvedOutput;
	                nums[i] = 999;
	                i = nums.length-1;
	                continue;
        		} else if (nums[i] > 0) {
        			
        			
        			terminate ++;
    	        	if (terminate == 1000) {
    	        		int[] failedOutput = {0,0,0,0};
    	        		return failedOutput;
    	        	}
    	        	
    	            if ( target % nums[i] == 0 && target / nums[i] == 1 ) {
    	                output.add(i);
    	                int[] SolvedOutput = output.stream().mapToInt(Integer::intValue).toArray();
    	                finalOutput = SolvedOutput;
    	                target = target - nums[i];
    	                i = nums.length-1;
    	                return SolvedOutput;
    	                
    	            } else {
    	            	int bestCand = -1;
    		            for (int x = (nums.length-1); x >=0; x--) {
    		            	if (nums[x] == 0) continue; // <-- skip zeros to prevent / by zero
    		            	if ( ((target%nums[x]) < target) && (target / nums[x] >= 1)) {
    		            		if (bestCand == -1) {
    		            			bestCand = x;
    		            		} else if (!(nums[x] == nums[Math.abs(bestCand)])) {
    		            			
    		            		} else if (((long)(target / nums[x]) <= (long)(target / nums[Math.abs(bestCand)]) && (target % nums[x]) <= target / nums[Math.abs(bestCand)])) {
    		            			bestCand = x;
    		            		}
    		            	}
    		            }
    		            if (bestCand == -1) {
    		            	skip = skip + 1;
    		            	i = (nums.length-1) - skip;	
    		            	continue;
    		            }
    		            target = target - nums[Math.abs(bestCand)];
    		            output.add(bestCand);
    		            nums[Math.abs(bestCand)] = 9999;
    		            int[] SolvedOutput = output.stream().mapToInt(Integer::intValue).toArray();
    	                finalOutput = SolvedOutput;
    	                i = nums.length-1;	
    	            }
        		}
	        }
	        	
	        return finalOutput;
	    }
	}
	
	
	
	
}
