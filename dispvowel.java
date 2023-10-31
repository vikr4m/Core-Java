import java.util.Scanner;
class dispvowel{
	public static void main(String args[]){
		String str;
		char ch;
		int i=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your string:");
		str = sc.nextLine();

		for(int j=0;j<str.length();j++){
			ch=str.charAt(j);

			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
				i=1;
				System.out.println(ch);
			}
		}
		if(i==0){
			System.out.println("No vowels in the string");
		}
	}
}