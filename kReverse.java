
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
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
 LinkedListNode<Integer> curr = head;
		LinkedListNode<Integer> next = null;
		LinkedListNode<Integer> prev = null;
		int count = 0;
		while (count<k && curr != null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			count++;
		}
		if (next != null) {
			head.next=kReverse(next, k);
		}
		return prev;
	}
}
