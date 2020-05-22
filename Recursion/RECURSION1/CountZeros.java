
public class solution {

	public static int countZerosRec(int input){
		// Write your code here
        if(input==0){
            return 0;
        }
        if(input<0){
        return 0;
        }
        int count=0;
       int ans=input%10;
        if(ans==0){
            count++;
        }
        count=count+countZerosRec(input/10);
        return count;
	}
}
