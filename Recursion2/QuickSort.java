
public class Solution {
	
	
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		int low = 0;
        int high = input.length - 1;
        sort(input,low,high);
	}
    
    
    public static void sort(int input[] , int low, int high){
        if(low < high){
            int pi = partition(input,low,high);
            sort(input,low,pi-1);
            sort(input,pi+1,high);
        }
    }
    
    
    // For partitioning the array 
    public static int partition(int input[] , int low, int high){
        int pivot = input[high];
        int i  = (low-1); //index of smaller element
        for (int j  = low ; j < high ; j++){
            if(input[j] <= pivot){
                i++;
                int temp = input[i];
                input[i] = input[j];
                input[j]= temp;
            }
        }
        int temp = input[i+1];
        input[i+1] = input[high];
        input[high] = temp;
            
        return i+1;
    }
	
}