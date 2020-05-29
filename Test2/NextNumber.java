/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {
    public static LinkedListNode<Integer> newNode(int data){
		LinkedListNode<Integer> new_node = new LinkedListNode<Integer>(data);  
	    new_node.data = data;  
	    new_node.next = null;  
	    return new_node;
	}
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
		LinkedListNode<Integer> prev = null;
		LinkedListNode<Integer> current = head;
		LinkedListNode<Integer> next = null;
		while (current != null) {
			next = current.next;  
	        current.next = prev;  
	        prev = current;  
	        current = next;
		}
		return prev;
	}
	public static LinkedListNode<Integer> addOne(LinkedListNode<Integer> head){
		   LinkedListNode<Integer> res = head;
		   LinkedListNode<Integer> temp = null;
		   LinkedListNode<Integer> prev = null;
		   int sum, carry = 1;
		   while (head != null) {
			   sum = carry+head.data;
			   carry = (sum >= 10)? 1 : 0;
			   sum = sum % 10;
			   head.data = sum;
			   temp = head;  
		       head = head.next;
		   }
		   
		   if (carry > 0) { 
		        temp.next = newNode(carry);
           }
		   return res;		
	}


	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
        if (head == null){
            return null;
        }
        head = reverse(head);
		head = addOne(head);
		return reverse(head);
   
	}


}
