//7) Max & Min of array.
package CoreJavaQandA;
import java.util.Scanner;

public class minmaxarray {
    public static void minmaxarr(int ar[], int n){
        int small=ar[0];
        int large=ar[1];
        if(large<small){
            small=ar[1];
            large=ar[0];
        }
        for (int i = 2; i < ar.length; i++) {
            if(ar[i]>large){
                large = ar[i];
            }
            if(ar[i]<small){
                small = ar[i];
            }
        }

        System.out.println("Smallest: "+small);
        System.out.println("Largest: "+large);
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        minmaxarr(ar,n);
        sc.close();
    }
}
