
public class Solution {

	public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        
        if(input.length()==0){
            return input;
        }
            String output="";
        for(int i=0;i<input.length();i++){
    
                    
            if(input.charAt(i)==c1){
                output+=c2;
            }
            else{
                
                output+=input.charAt(i);
            }
        }
		return output;
        
	}
}
