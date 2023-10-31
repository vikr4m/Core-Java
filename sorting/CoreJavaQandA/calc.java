//12) Implement a program for arithmetic operation as addition, sub, mul, div by using switch case / do while.
package CoreJavaQandA;
import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers");
        double a = sc.nextInt();
        double b = sc.nextInt();

        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\nEnter your choice :");
        int ch= sc.nextInt();
        
        
        switch (ch) {
            case 1:
                System.out.println("Answer: "+(a+b));        
            break;
            
            case 2:
                System.out.println("Answer: "+(a-b));        
            break;

            case 3:
                System.out.println("Answer: "+(a*b));        
            break;
            
            case 4:
                System.out.println("Answer: "+(a/b));        
            break;
        
            default:
                System.out.println("Wrong choice");
            break;
        }
        sc.close();
    }
}
