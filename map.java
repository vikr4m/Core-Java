import java.util.*;
class map{
	public static void main(String args[]){
		Map<String,Integer> hasmap = new HashMap<String,Integer>();

		hasmap.put("Smith",30);
		hasmap.put("Anderson",31);
		hasmap.put("Lewis",29);
		hasmap.put("Cook",29);
		System.out.println("Display entries in Hashmap"+hasmap);

		Map<String,Integer> treemap = new TreeMap<String,Integer>(hasmap);
		System.out.println("Display entries in Hashmap"+treemap);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter persons name: ");
		String name = sc.nextLine();
		System.out.println(hasmap.get(name).intValue());
	}
}