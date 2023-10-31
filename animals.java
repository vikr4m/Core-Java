interface transport{
	void deliver();
}

abstract class animal{
	abstract void display();
}

class tiger extends animal{
	void display(){
		System.out.println("Tiger Class");
	}
}

class camel extends animal{
	void display(){
		System.out.println("Camel Class");
	}

	void deliver(){
		System.out.println("Camel deliver");
	}
}

class deer extends animal{
	void display(){
		System.out.println("Deer Class");
	}
}

class donkey extends animal{
	void display(){
		System.out.println("Donkey Class");
	}

	void deliver(){
		System.out.println("Donkey deliver");
	}
}


class animals{
	public static void main(String args[]){
		tiger t = new tiger();
		camel c = new camel();
		deer d = new deer();
		donkey don = new donkey();
		t.display();
		c.display();
		c.deliver();
		d.display();
		don.display();
		don.deliver();
	}
}
