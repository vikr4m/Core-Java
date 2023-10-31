import java.util.Scanner;
import java.util.ArrayList;
class arrlist{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++){
			list.add(sc.nextInt());
		}
		sort(list);

		System.out.println(list.toString());
	}

	public static void sort(ArrayList<Integer> list){
		java.util.Collections.sort(list);
	}
}