/***************
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Queue<Integer> st = new Queue<Integer>();

		int choice = s.nextInt();
		int input;

		while (choice !=-1) {
			if(choice == 1) {
				input = s.nextInt();
				st.enqueue(input);
			}
			else if(choice == 2) {
				try {
					System.out.println(st.dequeue());
				} catch (QueueEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 3) {
				try {
					System.out.println(st.front());
				} catch (QueueEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 4) {
				System.out.println(st.size());
			}
			else if(choice == 5) {
				System.out.println(st.isEmpty());
			}
			choice = s.nextInt();
		}
	}
}

class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
	}
}


 ***********/
class QueueEmptyException extends Exception{
    QueueEmptyException(){
        super();
    }
}


public class Queue<T> {
private Node<T> front;
    private Node<T> rear;
    private int size;
	public Queue() {
        size=0;
        front=null;
        rear=null;

	}

	public void enqueue(T data) {
        Node<T> newNode=new Node<T>(data);
	if(front==null){
            front=newNode;
            rear=newNode;
        size++;
        return;
        }
        rear.next=newNode;
        rear=newNode;
        size++;
	}

	public int size() {
return size;
	}

	public boolean isEmpty() {
return (size==0);
	}

	public T dequeue() throws QueueEmptyException {
        if(size==0){
            throw new QueueEmptyException();
        }
        T temp=front.data;
        front=front.next;
        size--;
        return temp;
	}

	public T front() throws QueueEmptyException {
        if(size==0){
            throw new QueueEmptyException();
        }
return front.data;
	}
}
