Code : Post-order Traversal
Send Feedback
Given a generic tree, print the post-order traversal of given tree.
Post-order traversal is : Children and then Root
Input format :
Elements in level order form separated by space (as per done in class). Order is - 
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
Output Format :
Post-order traversal, elements separated by space
Sample Input :
10 3 20 30 40 2 400 50 0 0 0 0 
Sample Output :
400 50 20 30 40 10



public class Solution {


	public static void postOrder(TreeNode<Integer> root){
		if(root.children.size()==0){
        System.out.print(root.data+" ");
               return ;
        }
        
        for(int i=0;i<root.children.size();i++){

            postOrder(root.children.get(i));
        }
        System.out.print(root.data+" ");
	}

}
