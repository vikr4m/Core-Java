//23) Perform arithmetic operations by using function.
package CoreJavaQandA;
import java.util.Scanner;

public class arthop {
    public static double add(double a,double b){
        double c = a+b;
        return c;
    }
    public static double sub(double a,double b){
        double c = a-b;
        return c;
    }
    public static double mul(double a,double b){
        double c = a*b;
        return c;
    }
    public static double div(double a,double b){
        double c = a/b;
        return c;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();

    System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\nEnter your choice :");
    int ch= sc.nextInt();

    switch (ch) {
        case 1:
            System.out.println(add(a,b));        
        break;
        
        case 2:
            System.out.println(sub(a,b));        
        break;

        case 3:
            System.out.println(mul(a,b));        
        break;
        
        case 4:
            System.out.println(div(a,b));        
        break;
    
        default:
            System.out.println("Wrong choice");
        break;
    }
    sc.close();
  }  
}
