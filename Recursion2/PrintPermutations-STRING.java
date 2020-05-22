public class solution {

	public static void permutations(String input){
		// Write your code here
		permutations("", input);
	}
	public static void permutations(String start, String remain) {
		if (remain.length()==0) {
			System.out.println(start);
		}
		for (int i=0; i<remain.length(); i++) {
			String newStart= start+remain.charAt(i);
			String newRemain= remain.substring(0, i)+remain.substring(i+1);
			permutations(newStart, newRemain);
		}
	}
}
