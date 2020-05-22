
public class solution {

	// Return the changed string
	public static String removeX(String input){
		// Write your code here
int size=input.length();
        String output="";
        
        if(size==0){
            return null;
        }
        
        for(int i=0;i<size;i++)
        {
            if(input.charAt(i)=='x')
            {
                output+="";
                
            }
            else
            {
                output+=input.charAt(i);
            }
        }
        return output;
        
	}
}
