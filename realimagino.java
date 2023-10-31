import java.util.Scanner;
class complexno{
    int real,imaginary;
    int totalreal,totalimaginary;
    Scanner sc = new Scanner(System.in);

    complexno(int i){
        System.out.println("Complex number "+i);
        System.out.print("Enter real: ");
        real = sc.nextInt();
        System.out.print("Enter imaginary: ");
        imaginary = sc.nextInt();
    }

    void addnos(complexno c2){
        totalreal = real + c2.real;
        totalimaginary = imaginary + c2.imaginary;
    }

    void disp(){
        System.out.println("Total = "+totalreal+"+"+totalimaginary+"i");
    }
}

class realimagino{
    public static void main(String args[]){
        complexno c1 = new complexno(1);
        complexno c2 = new complexno(2);
        c1.addnos(c2);
        c1.disp();
    }
}