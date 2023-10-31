import java.util.Scanner;

class factrecu{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number for factorial: ");
		int f = sc.nextInt();

		int factorial = fact(f);
		System.out.println("Factorial of entered number is: "+factorial);
	}

	static int fact(int f){
		int output;
		if(f==1){
			return 1;
		}

		output = fact(f-1) * f;
		return output;
	}
}