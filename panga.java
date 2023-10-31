class panga{
	public static void main(String[] args){
		int a =3;
		int b =4;

		System.out.println("In main function.");
		System.out.println("A: "+a+"\tB: "+b);

		func(a,b);
	}
		static void func(int a, int b){
			a = 5;
			b = 4;
			System.out.println("In a function.");
			System.out.println("A: "+a+"\tB: "+b);
		}

	
}