import java.util.Scanner;

public class SimpleCalc implements ICalculator {

	public int add(int n1, int n2) {
		return n1+n2 ;
	}

	public float divide(int n1, int n2) throws RuntimeException {
		
		return (float)n1/(float)n2;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int  n1 = in.nextInt();
		int  n2 = in.nextInt();
		in.close();
		ICalculator result =new SimpleCalc();
		System.out.println(result.add(n1,n2));
		System.out.println(result.divide(n1,n2));

	}

	
	

	
}
