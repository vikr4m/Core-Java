class book{
	public static void main(String args[]){
		books b = new books(args[0]);
		bookpub bp = new bookpub(args[0], args[1]);
		paperpub pp = new paperpub(args[0], args[2]);

		books bs = b;
		bs.display();
		bs=bp;
		bs.display();
		bs=pp;
		bs.display();
	}
}
class books{
	private String authorname;

	books(String a){
		authorname = a;
	}

	void display(){
		System.out.println("Author: "+authorname);
	}
}

class bookpub extends books{
	private String title;

	bookpub(String a, String t){
		super(a);
		title = t;
	}

	void display(){
		System.out.println("Book Title: "+title);
	}
}

class paperpub extends books{
	private String title;

	paperpub(String a, String t){
		super(a);
		title = t;
	}

	void display(){
		System.out.println("Paper Title: "+title);
	}
}

