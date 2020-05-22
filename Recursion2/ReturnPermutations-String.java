public class solution {
	
	public static String[] permutationOfString(String input){
		if (input.length() == 0) {
            String[] myans = { "" };
            return myans;
        }

        char cc = input.charAt(0);
        String[] smallans = permutationOfString(input.substring(1));
        String[] myans = new String[input.length()*smallans.length];
        
        int k = 0;
        for (int j = 0; j < smallans.length; j++) {
            String currstring = smallans[j];
            for (int i = 0; i <=currstring.length(); i++) {
                myans[k] = currstring.substring(0,i)+cc+currstring.substring(i);
                k++;
            }
        }
        return myans;
	}
}
