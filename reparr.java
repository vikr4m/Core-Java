import java.util.ArrayList;
class reparr{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();

		list.add("Delhi");
		list.add("Mumbai");
		list.add("Bangalore");
		list.add("Hyderabad");
		list.add("Ahmedabad");
		System.out.println(list);

		list.set(list.indexOf("Ahmedabad"),"Surat");
		System.out.println(list);
	}
}