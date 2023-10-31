import java.util.Scanner;
import java.lang.Math;
class MyPoint{
	double x,y;

	MyPoint(){
		x = 0;
		y = 0;
	}

	MyPoint(double x,double y){
		this.x = x;
		this.y = y;
	}

	void getcor(){
		System.out.println("X = "+x+"\nY = "+y);
	}

	void distance(double x, double y){
		double distance = Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y));
		System.out.println("Distance: "+distance);
	}

	void distance(MyPoint mp2){
		double distance = Math.sqrt((x-mp2.x)*(x-mp2.x) + (y-mp2.y)*(y-mp2.y));
		System.out.println("Distance: "+distance);
	}

}

class ThreeDPoint extends MyPoint{
	double z;

	ThreeDPoint(){
		super(0,0);
		z = 0;
	}

	ThreeDPoint(double x,double y,double z){
		super(x,y);
		this.z = 0;
	}

	void distance(double x, double y, double z){
		double distance = Math.pow((Math.pow(this.x-x,2) + Math.pow(this.y-y,2) + Math.pow(this.z-z,2) * 1.0),0.5);
		System.out.println("Distance: "+distance);
	}

	void distance(ThreeDPoint tp2){
		double distance = Math.pow((Math.pow(x-tp2.x,2) + Math.pow(y-tp2.y,2) + Math.pow(z-tp2.z,2) * 1.0),0.5);
		System.out.println("Distance: "+distance);	
	}
}

class point{
	public static void main(String args[]){
		ThreeDPoint tp1 = new ThreeDPoint();
		ThreeDPoint tp2 = new ThreeDPoint(10,30,25.5);
		tp1.distance(1,1,1);
		tp1.distance(tp2);
	}
}
