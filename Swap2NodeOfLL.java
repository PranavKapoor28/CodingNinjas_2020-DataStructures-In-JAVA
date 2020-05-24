


/*
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
* */
public class Solution {
		public static  LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head,int i,int j){
		LinkedListNode<Integer> prev1 = null;
		LinkedListNode<Integer> prev2 = null;
		LinkedListNode<Integer> curr1 = head;
		LinkedListNode<Integer> curr2 = head;
		while (curr1 != null && i != 0) {
			prev1 = curr1;
			curr1 = curr1.next;
			i--;
		}
		while (curr2 != null && j != 0) {
			prev2 = curr2;
			curr2 = curr2.next;
			j--;
		}
		if (curr1 == null || curr2 == null) {
			return head;
		}
		if (prev1 != null) {
			prev1.next = curr2;
		} else {
			head = curr2;
		}
		if (prev2 != null) {
			prev2.next = curr1;
		} else {
			head = curr1;
		}
		LinkedListNode<Integer> temp = curr1.next;
		curr1.next = curr2.next;
		curr2.next = temp;
		return head;
		
	}
}