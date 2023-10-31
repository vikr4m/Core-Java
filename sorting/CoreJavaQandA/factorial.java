//24) Calculate the factorial of given numbers by using the fact function.
package CoreJavaQandA;
import java.util.Scanner;

public class factorial {
    public static void fact(int f){
        int sum=1;
        while(f!=0){
            sum*=f;
            f--;
        }
        System.out.print("Factorial: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        fact(f);
        sc.close();
    }
}
