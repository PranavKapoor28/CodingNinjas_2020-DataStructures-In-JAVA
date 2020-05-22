import java.util.*;
import java.io.*;

class FindUnique {
	
	
	//arr={2,2,3,3,6,6,7};
	//arr={1,2,2,3,3,6,6};
	public static int findUnique(int arr[]){
	    Arrays.sort(arr);
	    int i=0;
	    while(i<arr.length-1){
	       // System.out.println("the elements are "+arr[i+1]);
	        if(arr[i]!=arr[i+1]){
	            return arr[i];
	        }
	        i=i+2;
	    }
	    return arr[i];
	}
}