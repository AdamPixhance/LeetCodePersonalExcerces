public class MergeTwoSortedLists21Improved {
	class Solution {
		// List Node Class
		// predefined by LeetCode
		public static class ListNode {
			int val;
			ListNode next;

			ListNode() {
			}

			ListNode(int val) {
				this.val = val;
			}

			ListNode(int val, ListNode next) {
				this.val = val;
				this.next = next;
			}
		}

		// actual solution copy pasted from the most common solution online
		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			// temporary starting node created
			ListNode dummy = new ListNode(-1);
			// current node tracker
			ListNode current = dummy;
			
			// starting our main while loop
			while (list1 != null && list2 != null) {
				//checks if list1.val is smaller
				if (list1.val <= list2.val) {
					current.next = list1;
					list1 = list1.next;
				// otherwise takes list2.val
				} else {
					current.next = list2;
					list2 = list2.next;
				}
				current = current.next;
			}

			// Attach the remaining part of the list
			// Since a part of the list remains afterwards
			if (list1 != null)
				current.next = list1;
			else
				current.next = list2;
			
			// this is where the dummy node comes in
			// since the node starts with the dummy node
			// we can give back dummy.next
			// and that way, we return the head of the merged list
			return dummy.next; // return final merged list
		}
	}

}
