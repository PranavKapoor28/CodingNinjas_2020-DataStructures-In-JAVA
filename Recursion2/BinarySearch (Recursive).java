public class solution {

	// element - number to be searched
	public static int binarySearch(int input[], int element) {
		// Write your code here
		return binarySearch(input,0,input.length-1,element);
	}
    
    public static int binarySearch(int input[], int start,int end,int element) {
    
        if(start>end){
            return -1;
        }
        
        int mid=(start+end)/2;
        
        if(element==input[mid]){
            return mid;
        }
        else if(element<input[mid]){
            return binarySearch(input,start,mid-1,element);
        }
        
         else{
            return binarySearch(input,mid+1,end,element);
        }
        
}
}
