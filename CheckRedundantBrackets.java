import java.util.Stack;

public class solution {
	
	public static boolean checkRedundantBrackets(String input) {
		// Write your code here

          // create a stack of characters  
        Stack<Character> st = new Stack<>(); 
        char[] str = input.toCharArray(); 
        
        for(char ch:str)
        {
		if(ch==')')
          	{
    		char top=st.peek();
            st.pop();
            
            boolean flag=true;
            
            while(top!='('){
			if(top == '+' || top == '-'
                            || top == '*' || top == '/'){
                flag=false;
            }
                top=st.peek();
                st.pop();
                
            }
            if(flag==true)
            {
				return true;
            }
        }
            else
            {
                st.push(ch);
            }
        }
        return false;
	}
}