import java.util.*;
class setexample{
	public static void main(String args[]){
		Set hs = new HashSet();

		hs.add("London");
		hs.add("New York");
		hs.add("San Francisco");
		hs.add("Beijing");
		hs.add("New York");

		System.out.println("Size: "+hs.size());
		hs.remove("Beijing");
		System.out.println(hs);

		System.out.println(hs.contains("Beijing"));
		Set hs1 = new HashSet();
		hs1.add("Anand");
		hs1.add("Vadodara");
		hs1.add("Ahmedabad");
		System.out.println("The items in set2 are "+hs1);

		hs.addAll(hs1);
		System.out.println(hs);

		hs.removeAll(hs1);
		System.out.println(hs);

		hs1.add("New York");
		hs.retainAll(hs1);
		System.out.println(hs);
		System.out.println(hs1);
	}
}