abstract class vegetable{
	String color;
	vegetable(String color){
		this.color = color;
	}
}

class potato extends vegetable{
	potato(){
		super("cream");
	}
	public String toString(){
		return ("Potato: "+color);
	}
}
class brinjal extends vegetable{
	brinjal(){
		super("purple");
	}
	public String toString(){
		return ("Brinjal: "+color);
	}
}
class tomato extends vegetable{
	tomato(){
		super("red");
	}
	public String toString(){
		return ("Tomato: "+color);
	}
}

class abstvege{
	public static void main(String args[]){
		potato p =new potato();
		brinjal b =new brinjal();
		tomato t =new tomato();

		System.out.println(p.toString());
		System.out.println(b.toString());
		System.out.println(t.toString());
	}
}