
public class AddTwoNumbers {

	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode prev = new ListNode(0);
	        ListNode head = prev;
	        int carry = 0;
	        
	        
	        
	        while (l1 != null || l2 != null || carry != 0) 
	        // while the input isn't null, and no carry
	        
	        {
	            ListNode cur = new ListNode(0); //current node
	            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry; // if the current l1/l2 aren't null add them
	            cur.val = sum % 10; // modulo
	            carry = sum / 10; // carry the remainder
	            prev.next = cur; 
	            prev = cur;
	            
	            l1 = (l1 == null) ? l1 : l1.next;
	            l2 = (l2 == null) ? l2 : l2.next;
	        }
	        return head.next;
	    }
}
