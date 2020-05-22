
public class Solution {
	
		
     public static int staircase(int n){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */

         if(n==0 || n==1)
         {
             return 1;
         }
         if(n==2)
         {
			return 2;
         }
      
         	int x=n-1;
        	int y=n-2;
            int z=n-3;
         
         return staircase(x)+staircase(y)+staircase(z);
         
	}
	
}