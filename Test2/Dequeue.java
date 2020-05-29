/******************
 * Following is the main function we are using internally.
 * Refer this for completing the Dequeue class
 *
 
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Dequeue dq = new Dequeue(10);
		while(true){
			int choice = s.nextInt(),input;
			switch (choice) {
			case 1:
				input = s.nextInt();
				dq.insertFront(input);
				break;
			case 2:
				input = s.nextInt();
				dq.insertRear(input);
				break;
			case 3:
				dq.deleteFront();
				break;
			case 4:
				dq.deleteRear();
				break;
			case 5:
				System.out.println(dq.getFront());
				break;
			case 6:
				System.out.println(dq.getRear());
				break;
			default:
				return ;
			}  
		}
	} 
 ******************/
// import java.util.List;
// import java.util.ArrayList;
// public class Dequeue {
//     // Complete this class
//     private List<Integer> deque = new ArrayList<Integer>(10);
//     public void insertFront(int item){
//         System.out.println("adding at front: "+item);
//         deque.add(0,item);
//         System.out.println(deque);
//     }
//     public void insertRear(int item){
//         System.out.println("adding at rear: "+item);
//         deque.add(item);
//         System.out.println(deque);
//     }
//     public void deleteFront(){
//         if(deque.isEmpty()){
//             System.out.println("Deque underflow!! unable to remove.");
//             return;
//         }
//         int rem = deque.remove(0);
//         System.out.println("removed from front: "+rem);
//         System.out.println(deque);
//     }
//     public void deleteRear(){
//         if(deque.isEmpty()){
//             System.out.println("Deque underflow!! unable to remove.");
//             return;
//         }
//         int rem = deque.remove(deque.size()-1);
//         System.out.println("removed from front: "+rem);
//         System.out.println(deque);
//     }
//     public int getFront(){
//         int item = deque.get(0);
//         System.out.println("Element at first: "+item);
//         return item;
//     }
//     public int getRear(){
//         int item = deque.get(deque.size()-1);
//         System.out.println("Element at rear: "+item);
//         return item;
//     }
public class Dequeue {
    static final int MAX = 100; 
    int  arr[]; 
    int  front; 
    int  rear; 
    int  size; 
      
    public Dequeue(int size) 
    { 
        arr = new int[10]; 
        front = -1; 
        rear = 0; 
        this.size = size; 
    }
    boolean isFull() 
    { 
        return ((front == 0 && rear == size-1)|| front == rear+1);
             
    } 
   
    // Checks whether Deque is empty or not. 
    boolean isEmpty () 
    { 
        return (front == -1); 
    } 
   
    // Inserts an element at front 
    void insertFront(int key) 
    { 
        // check whether Deque if  full or not 
        if (isFull()) 
        { 
            System.out.println("-1");
            return;
        } 
   
        // If queue is initially empty 
        if (front == -1) 
        { 
            front = 0; 
            rear = 0; 
        } 
          
        // front is at first position of queue 
        else if (front == 0) 
            front = size - 1 ; 
   
        else // decrement front end by '1' 
            front = front-1; 
   
        // insert current element into Deque 
        arr[front] = key ; 
    } 
   
    // function to inset element at rear end 
    // of Deque. 
    void insertRear(int key) 
    { 
        if (isFull()) 
        { 
            System.out.println("-1"); 
            return; 
        } 
   
        // If queue is initially empty 
        if (front == -1) 
        { 
            front = 0; 
            rear = 0; 
        } 
   
        // rear is at last position of queue 
        else if (rear == size-1) 
            rear = 0; 
   
        // increment rear end by '1' 
        else
            rear = rear+1; 
          
        // insert current element into Deque 
        arr[rear] = key ; 
    } 
   
    // Deletes element at front end of Deque 
    void deleteFront() 
    { 
        // check whether Deque is empty or not 
        if (isEmpty()) 
        { 
            System.out.println("-1"); 
             
        } 
   
        // Deque has only one element 
        if (front == rear) 
        { 
            front = -1; 
            rear = -1; 
        } 
        else
            // back to initial position 
            if (front == size -1) 
                front = 0; 
   
            else // increment front by '1' to remove current 
                // front value from Deque 
                front = front+1; 
    } 
   
    // Delete element at rear end of Deque 
    void deleteRear() 
    { 
        if (isEmpty()) 
        { 
            System.out.println("-1"); 
             
        } 
   
        // Deque has only one element 
        if (front == rear) 
        { 
            front = -1; 
            rear = -1; 
        } 
        else if (rear == 0) 
            rear = size-1; 
        else
            rear = rear-1; 
    } 
   
    // Returns front element of Deque 
    int getFront() 
    { 
        // check whether Deque is empty or not 
        if (isEmpty()) 
        { 
            return -1; 
        } 
        return arr[front]; 
    } 
   
    // function return rear element of Deque 
    int getRear() 
    { 
        // check whether Deque is empty or not 
        if(isEmpty() || rear < 0) 
        { 
             
            return -1 ; 
        } 
        return arr[rear]; 
    }
}