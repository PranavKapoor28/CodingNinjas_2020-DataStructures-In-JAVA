Code : Find Height
Send Feedback
Given a generic tree, find and return the height of given tree.
Input format :
Elements in level order form separated by space (as per done in class). Order is - 
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
Output Format :
Height
Sample Input :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output :
3


import java.util.*;
public class Solution {

	/*	TreeNode structure 
	 * 
	 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

	public static int height(TreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
         
		 */
        
        int height = 0;
    if (root == null )
    {
    return height;
    }
        
    if (root.children == null)
    {
    return 1;
    }
        
   for (TreeNode<Integer> child : root.children) 
   {
    height = Math.max(height, height(child));
  	}
   return height + 1;
	}

}
