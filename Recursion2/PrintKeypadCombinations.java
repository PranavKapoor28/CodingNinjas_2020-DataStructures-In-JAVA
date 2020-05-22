public class solution {

    
    private static String getSequence(int n){
        switch(n){
            case 2:	return "abc";

            case 3:	return "def";

            case 4:	return "ghi";

            case 5:	return "jkl";

            case 6:	return "mno";

            case 7:	return "pqrs";

            case 8:	return "tuv";

            case 9:	return "wxyz";

            default:break;
        }
        return "";
    }

    
    	public static void keypad(int input, String outputSoFar){
		if(input== 0){
			System.out.println(outputSoFar);
			return;
		}
		String pd=getSequence(input%10);
            int num=input/10;
           
            for(int i=0;i<pd.length();i++){
                 char List[]=keypad(num,outputSoFar+pd.charAt(i));
                System.out.println(List[i]);
            }
		// we choose to include the first character
		
		
	}
	

   public static void printKeypad(int input){

        keypad(input, "");
    }
	
}
