class CI{
	int n;
	boolean valueSet = false;

	synchronized int receive(){
		while (!valueSet)
			try{
				wait();
			}catch (InterruptedException e){
				System.out.println("InterruptedException caught");
			}

		System.out.println("Receive: "+n);
		valueSet = false;
		notify();
		return n;
	}
	synchronized void send(int n){
		while(valueSet)
			try{
				wait();
			} catch(InterruptedException e){
				System.out.println("InterruptedException caught");
			}
		this.n = n;
		valueSet = true;
		System.out.println("Send: "+n);
		notify();
	}
}

class producer implements Runnable{
	CI ci;

	producer(CI ci){
		this.ci = ci;
		new Thread(this, "producer").start();
	}

	public void run(){
		int i=0;
		while(true){
			ci.send(i++);
		}
	}
}

class consumer implements Runnable{
	CI ci;

	consumer(CI ci){
		this.ci = ci;
		new Thread(this, "consumer").start();
	}

	public void run(){
		while(true){
			ci.receive();
		}
	}
}

class producerconsumer{
	public static void main(String args[]){
		CI ci = new CI();
		new producer(ci);
		new consumer(ci);
		System.out.println("Press Control-C to stop");
	}
}

