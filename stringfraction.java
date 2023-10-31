import java.util.*;
import java.lang.Math;
class strfrac{
	String strnum;
	int count,number,deno,nume,expo;
	Scanner sc = new Scanner(System.in);

	void getStringNumber(){
		System.out.print("Enter number in string: ");
		strnum = sc.next();
	}
	void convert(){
		for(int i=0;i<strnum.length();i++){
			if (strnum.charAt(i)=='.') {
				count = strnum.length()	- (i+1);
				break;
			}
		}

		number	= (int)(Double.parseDouble(strnum) * Math.pow(10,count));
		expo = (int)Math.pow(10,count);
		System.out.println("Number: "+number);

		int gcd=1, flag=0;
		for(int i=2;i<=number || i<=expo; i++){
			for(int j=2; j<i;j++){
				if(i%j==0)
					flag=1;
			}
			if(flag==0 && number %i ==0 && expo %i ==0){
				gcd = gcd*i;
			}
			flag=0;
		}

		nume = number/gcd;
		deno = expo/gcd;
		System.out.println("Fraction: "+nume+"/"+deno);
	}	
}

class stringfraction{
	public static void main(String args[]){
		strfrac sf = new strfrac();
		sf.getStringNumber();
		sf.convert();
	}
}