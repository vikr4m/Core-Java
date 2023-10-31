//Write a program to calculate sum and average of an array.
package CoreJavaQandA;
import java.util.*;
public class sumavgarr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        double avg = 0;
        for(int i =0; i<n; i++){
            sum+=arr[i];
        }
        avg = sum/n;

        System.out.println("Sum :"+sum);
        System.out.println("Average :"+avg);
        sc.close();
    }
}
