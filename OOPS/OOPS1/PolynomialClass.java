
/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */


public class Polynomial {

	private int[] coeff;
	private int degree;

	public Polynomial() {
		coeff=new int[5];
		degree=-1;
	}
	public void setCoefficient(int degree,int coefficient) {
		if(degree >=coeff.length) {
			restructure(degree);
		}
		coeff[degree]=coefficient;
		if(degree >= this.degree) {
			this.degree=degree;
		}
	}
	public Polynomial add(Polynomial p) {

		Polynomial x=new Polynomial();

		int i=0,j=0,k=0;
		while(i < p.coeff.length && j < this.coeff.length) {
			x.setCoefficient(k, p.coeff[i] + this.coeff[i]);
			i++;
			j++;
			k++;
		}
		while(i<p.coeff.length) {
			x.setCoefficient(k, p.coeff[i]);
			k++;
			i++;
		}
		while(j<this.coeff.length) {
			x.setCoefficient(k, this.coeff[j]);
			k++;
			j++;
		}


		return x;

	}
	public Polynomial subtract(Polynomial p) {

		Polynomial x=new Polynomial();

		int i=0,j=0,k=0;
		while(i < p.coeff.length && j < this.coeff.length) {
			x.setCoefficient(k,  this.coeff[i] - p.coeff[i] );
			i++;
			j++;
			k++;
		}
		while(i<p.coeff.length) {
			x.setCoefficient(k, -p.coeff[i]);
			k++;
			i++;
		}
		while(j<this.coeff.length) {
			x.setCoefficient(k, this.coeff[j]);
			k++;
			j++;
		}


		return x;

	}
	public Polynomial multiply(Polynomial p) {

		Polynomial x=new Polynomial();

		for(int i=0;i<p.coeff.length;i++) {
			for(int j=0;j<this.coeff.length;j++) {
				if(i + j <=x.degree)
					x.setCoefficient( i + j ,x.coeff[i+j]+p.coeff[i] * this.coeff[j]);
				else
					x.setCoefficient(i + j ,p.coeff[i] * this.coeff[j]);
			}
		}
		return x;

	}
	public void print() {
		for(int i=0;i<coeff.length;i++) {
			if(coeff[i] !=0)
				System.out.print( coeff[i]  +"x"+ i +" ");
		}
	}
	private void restructure(int degree) {

		int[] temp=coeff;
		coeff=new int[degree + 1];
		for(int i=0;i<temp.length;i++) {
			coeff[i]=temp[i];
		}
	}




}
