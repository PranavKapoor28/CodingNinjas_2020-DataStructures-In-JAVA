import java.util.Stack;

public class Solution {

	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
		
        	if (s1.size() <= 1) {
			return;
		}
		int a = s1.pop();
		reverseStack(s1, s2);
		while(!s1.isEmpty()) {
			int val = s1.pop();
			s2.push(val);
		}
		s1.push(a);
		while (!s2.isEmpty()) {
			int val = s2.pop();
			s1.push(val);
		}
	}
}