import java.util.*;
import java.io.*;

class DuplicateInArray {
	

	public static int duplicate(int arr[]){
	    Arrays.sort(arr);
	    int i=0;
	    for(i=0;i<arr.length;i++){
	       // System.out.println("the elements are "+arr[i+1]);
	        if(arr[i]==arr[i+1]){
	        return arr[i];
            }
	    }
	    return -1;
	}
}