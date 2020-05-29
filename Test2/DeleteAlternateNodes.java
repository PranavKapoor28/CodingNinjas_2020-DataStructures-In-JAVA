
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
} */
public class Solution 
{
	public static void deleteAlternateNodes(LinkedListNode<Integer> head) 
    {
		LinkedListNode<Integer> prev = head;
		LinkedListNode<Integer> now = head.next;
        int count=0;
        if(head==null)
        {
		return;
        }
		while(prev!=null && now!=null)
        {
		prev.next=now.next;
            now=null;
            prev=prev.next;
        if(prev!=null){
		now=prev.next;
        }
	}
}
}