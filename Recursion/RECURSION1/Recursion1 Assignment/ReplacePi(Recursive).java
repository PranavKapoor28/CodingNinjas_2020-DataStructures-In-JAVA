public class solution {

	// Return the changed string
	public static String replace(String input){
		// Write your code here
        int size=input.length();
        String output="";
	
        int i=0;
        for(i=0;i<size;i++){
        if(i+1<size && input.charAt(i)=='p' && input.charAt(i+1)=='i')
        {    
            output+="3.14";
            i++;
        }
        else
        {    
            output+=input.charAt(i);
        }
        }
            
         return output;
        
	}
}
