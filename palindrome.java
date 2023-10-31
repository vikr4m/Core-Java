import java.util.Scanner;
class palindrome{
	public static void main(String args[]){
		String str, rev="";
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your string:");
		str = sc.next();

		int len = str.length();

		for(int i=len-1;i>=0;i--){
			rev = rev+str.charAt(i);
		}

		if(str.equals(rev)){
			System.out.println(str+" is palindrome");
		}
		else{
			System.out.println(str+" is not palindrome");	
		}
	}
}