import java.util.ArrayList;

public class MergeTwoSortedLists21 {

	public static void main(String[] args) {
		// debugging with different inputs
		// creating list1
		ListNode list1Head = new ListNode(1);
		ListNode list1 = new ListNode(2);
		list1Head.next = list1;
		ListNode list1Next = new ListNode(4);
		list1.next = list1Next;
		list1 = list1Next;

		// creating list2
		ListNode list2Head = new ListNode(1);
		ListNode list2 = new ListNode(3);
		list2Head.next = list2;
		ListNode list2Next = new ListNode(4);
		list2.next = list2Next;
		list2 = list2Next;

		// outputting list 1
		System.out.print("List 1 = [");
		list1 = list1Head;
		while (list1 != null) {
			System.out.print(list1.val);
			if (list1.next != null) {
				System.out.print(",");
			}
			list1 = list1.next;
		}
		System.out.println("]");

		// outputting list 2
		System.out.print("List 2 = [");
		list2 = list2Head;
		while (list2 != null) {
			System.out.print(list2.val);
			if (list2.next != null) {
				System.out.print(",");
			}
			list2 = list2.next;
		}
		System.out.println("]");

		// running the solution and printing the output
		ListNode Result = Solution.mergeTwoLists(null, null);
		System.out.print("Solution = [");
		while (Result != null) {
			System.out.print(Result.val);
			if (Result.next != null) {
				System.out.print(",");
			}
			Result = Result.next;
		}
		System.out.println("]");

	}

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

	class Solution {
		public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			// create an ArrayList to start recording the input of both lists
			ArrayList<Integer> mergedList = new ArrayList<Integer>();
			// create the mergedTwoLists ListNode to return
			ListNode mergedTwoListsHead = new ListNode();
			// check if list1 is not empty
			System.out.println(mergedList.size());
			if (list1 == null && list2 == null) {
				return null;
			}
			if (list1 != null) {
				while (list1 != null) {
					mergedList.add(list1.val);
					list1 = list1.next;
				}
			}
			if (list2 != null) {
				while (list2 != null) {
					mergedList.add(list2.val);
					list2 = list2.next;
				}
			}
			// checks if there is no items in both lists, to just return an empty ListNode
			// item
			if (mergedList.size() == 0) {
				return mergedTwoListsHead;
			}
			System.out.println(mergedList.size());
			// checks if there is only exactly one item, just return that item as is
			if (mergedList.size() == 1) {
				mergedTwoListsHead.val = mergedList.get(0);
				return mergedTwoListsHead;
			}
			// for all other cases, this code runs.
			mergedList.sort(null);
			mergedTwoListsHead.val = mergedList.get(0);
			ListNode mergedTwoLists = new ListNode(mergedList.get(1));
			mergedTwoListsHead.next = mergedTwoLists;
			for (int i = 2; i < mergedList.size(); i++) {
				ListNode next = new ListNode(mergedList.get(i));
				mergedTwoLists.next = next;
				mergedTwoLists = next;
			}
			return mergedTwoListsHead;

		}
	}

}
