interface eventlistener{
	void performevent();
}

interface mouselistener extends eventlistener{
	void mouseclicked();
	void mousepressed();
	void mousereleased();
	void mousemoved();
	void mousedragged();
}

interface keylistener extends eventlistener{
	void keypressed();
	void keyreleased();
}

class inter implements mouselistener, keylistener{
	public void performevent(){
		System.out.println("Perform event method");
	}

	public void mouseclicked(){
		System.out.println("Mouse Clicked");
	}

	public void mousepressed(){
		System.out.println("Mouse Pressed");
	}

	public void mousereleased(){
		System.out.println("Mouse released");
	}

	public void mousemoved(){
		System.out.println("Mouse Moved");
	}	

	public void mousedragged(){
		System.out.println("Mouse Dragged");
	}

	public void keypressed(){
		System.out.println("Key Pressed");
	}

	public void keyreleased(){
		System.out.println("Key Released");
	}


	public static void main(String args[]){
		inter e = new inter();
		e.performevent();
		e.mouseclicked();
		e.mousepressed();
		e.mousereleased();
		e.mousemoved();
		e.mousedragged();
		e.keypressed();
		e.keyreleased();
	}
}