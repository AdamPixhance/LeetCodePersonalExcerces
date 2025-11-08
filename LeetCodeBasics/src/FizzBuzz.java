import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Solution.fizzBuzz(20));
		

	}
	
	class Solution {
	    public static List<String> fizzBuzz(int n) {
	        ArrayList<String> answer = new ArrayList<String>();
	        for (int i = 1 ; i <= n; i++) {
	            if ( i % 5 == 0 || i % 3 == 0) {
	            	String tempFizzBuzz = "";
		            if (i % 3 == 0) {
		                tempFizzBuzz += "Fizz";
		            }
		            if (i % 5 == 0) {
		                tempFizzBuzz += "Buzz";
		            }
	                answer.add(tempFizzBuzz);
	            } else {
	            	answer.add(String.valueOf(i));
	            }
	            
	        }
	        return answer;
	    }
	}

}
