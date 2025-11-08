import java.util.ArrayList;

public class middleNodeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1,
				new ListNode(2, 
						new ListNode(3,
								new ListNode(4,
										new ListNode(5
												)
										)
								)
						)
				);
		
		
		
		
		
		ArrayList<Integer> outputStringTest = new ArrayList<Integer>();
		ListNode currentTest = head;
		while (currentTest != null) {
            outputStringTest.add(currentTest.val);
            currentTest = currentTest.next;
        }
		System.out.println("The List before the Solution Method: " + outputStringTest.toString());

		ListNode middleNode = Solution.middleNode(head);
		ArrayList<Integer> outputString = new ArrayList<Integer>();
		ListNode current = middleNode;
		while (current != null) {
            outputString.add(current.val);
            current = current.next;
        }
		System.out.println("The List after finding the new middle: " + outputString.toString());

	}
	
	
	 
	 static public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	 
	class Solution {
		static int getLength(ListNode head) {
		    int length = 0;
		    ListNode current = head;
		    while (current != null) {
		        length++;
		        current = current.next;
		    }
		    return length;}
		    
	    public static ListNode middleNode(ListNode head) {
	    	int headLength = Solution.getLength(head);
	    	ListNode current = head;
	    	if (headLength % 2 == 0) {
	    		int midPoint = headLength/2 + 1;
	    		for (int i = 1; i < midPoint; i++) {
	    			current = current.next;
	    		}
	    	} else {
	    		int midPoint = (headLength+1) / 2;
	    		for (int i = 1; i < midPoint; i++) {
	    			current = current.next;
	    		}
	    	}
	    	
	    	
	    	
	        ListNode middleNode = current;
	        
	        return middleNode;
	    }
	}

}
