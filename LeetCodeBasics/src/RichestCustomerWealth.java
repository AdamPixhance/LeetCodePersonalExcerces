
public class RichestCustomerWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] accounts = {{1,2,3},{3,2,1}};
		System.out.println(Solution.maximumWealth(accounts));

	}
	
	class Solution {
	    public static int maximumWealth(int[][] accounts) {
	        int maximumWealth = 0;
	        int accountsX = accounts.length;
	        int richestSum = 0;
	        for (int x = 0;  x < accountsX; x++) {
	        	int accountSumXY = 0;
	        	int accountsY = accounts[x].length;
	        	for (int y = 0; y < accountsY; y++ ) {
	        		accountSumXY += accounts[x][y];
	        	}
	        	if (accountSumXY > richestSum) {
	        		richestSum = accountSumXY;
	        	}
	        	maximumWealth = richestSum;
	        		
	        }
	        
	        return maximumWealth;
	    }
	}

}
