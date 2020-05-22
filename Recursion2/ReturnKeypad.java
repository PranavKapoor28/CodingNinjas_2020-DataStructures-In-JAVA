public class solution {

    
    private static String getSquence(int n){
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


    public static String[] keypad(int input) {

        if(input==0){
            String[] ans = {""};
            return ans;
        }
        int current = input%10;
        int n = input/10;

        String[] smallAns = keypad(n);
        char List[] = getSquence(current).toCharArray();
        String[] ans = new String[smallAns.length*List.length];
        int k =0;
        for(int i=0;i<smallAns.length;i++){
            for(int j=0;j<List.length;j++) {
                ans[k] = smallAns[i] + List[j];
                k++;
            }
        }
        return ans;
    }
	
}
