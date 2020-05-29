import java.util.Stack;

public class Solution {

	
	// Function returns -1 if brackets can't be balanced
	public static int countBracketReversals(String input){
        
        if(input.length()==0)
        {
		return 0;
        }
        if(input.length()%2!=0)
        {
            return -1;
        }
        Stack<Character> st=new Stack<>();
        for(int i=0;i<input.length();i++){
        char c=input.charAt(i);
            if(c=='{')
            {
                st.push(c);
            }
            else{
                if(!st.isEmpty() && st.peek()=='{'){
                    st.pop();
                }
                else{
                    st.push(c);
                }
                
            }
        }
        
        int count=0;
        while(!st.isEmpty()){
            
            char ch1=st.pop();
            char ch2=st.pop();
            if(ch1!=ch2)
            {
                count=count+2;
            }
            else{
                count=count+1;
            }
        }
        return count;
    }
}