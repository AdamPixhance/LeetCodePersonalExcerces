
public class numberOfStepsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 14;
		System.out.print(Solution.numberOfSteps(num));
		

	}
	
	class Solution {
	    public static int numberOfSteps(int num) {
	        int numOfSteps = 0;
	        while (num != 0) {
	        	if (num % 2 == 0) {
	        		num = num / 2;
	        	} else {
	        		num--;
	        	}
	        	numOfSteps++;
	        }
	        return numOfSteps;
	    }
	}

}
