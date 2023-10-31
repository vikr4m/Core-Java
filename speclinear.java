import java.util.Scanner;
class speclinear{
	public static void main(String args[]){
		Integer[] list = new Integer[10];
		Scanner sc = new Scanner(System.in);
		int search;
		for(int i=0;i<list.length;i++){
			System.out.print("list["+i+"]: ");
			list[i] = sc.nextInt();
		}
		System.out.print("Enter value to find: ");
		search = sc.nextInt();
		int foundat = LinearSearch(list, search);

		if(foundat == -1){
			System.out.println(search+" is not present in the array.");
		}
		else{
			System.out.println(search+" is  present in the array at "+foundat);
		}
	}

	public static <E extends Comparable<E>> int LinearSearch (E[] list, E value){
		for(int i=0;i<list.length;i++){
			if(list[i].compareTo(value) == 0){
				return i;
			}
		}
		return -1;
	}
}