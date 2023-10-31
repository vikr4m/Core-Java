class odd extends Thread{										//Implementing thread by class
	public odd(){
		start();
	}

	public void run(){
		for(int i=0;i<1000;i++){
			if(i%2 !=0){
				System.out.println("Odd Thread "+i);
			}
		}
	}
}

class even implements Runnable{									//Implementing thread by interface
	Thread t;

	public even(){
		t = new Thread(this);
		t.start();
	}

	public void run(){
		for(int i=0;i<1000;i++){
			if(i%2 ==0){
				System.out.println("Even Thread "+i);
			}
		}
	}
}

class thread{
	public static void main(String args[]){
		odd t1 = new odd();
		even t2 = new even();
	}
}