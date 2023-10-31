import java.util.*;
class lennoffunc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x=0;
		String str;

		System.out.print("Enter string:");
		str = sc.next();

		char ch[] =str.toCharArray();
		for(char c:ch){
			x++;
		}
		System.out.println("Length: "+x);
	}
}