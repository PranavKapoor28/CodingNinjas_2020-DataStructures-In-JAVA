import java.util.Stack;

public class Solution {

	public static int[] stockSpan(int[] price) {
		// Write your code here

        if (price.length == 0) {
			return new int[] {0};
		}
		int [] result = new int[price.length];
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
        result[0] = 1;
        
        for(int i=1;i<price.length;i++)
        {
		while(!stack.isEmpty() && price[stack.peek()]<price[i])
        {
            stack.pop();
        }
            if(stack.isEmpty()){
                result[i]=i+1;
                
            }
            else{
                result[i]= (i-stack.peek());
            }
            
            stack.push(i);
        }
    return result;
    }
    
}