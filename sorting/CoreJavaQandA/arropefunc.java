//25) Implement the menu-driven program for printing the given operation for the array (create, display, max, reverse) by using the function
package CoreJavaQandA;
import java.util.Scanner;

public class arropefunc{
    public static void max(int arr[], int n){
        int max=arr[0];
                for (int i = 1; i < n; i++) {
                    if(arr[i]>max){
                        max=arr[i];
                    }
                }
        System.out.println("Maximum: "+max);
    }

    public static void min(int arr[], int n){
        int min=arr[0];
                for (int i = 1; i < n; i++) {
                    if(arr[i]<min){
                        min=arr[i];
                    }
                }
        System.out.println("Minimum: "+min);
    }

    public static void rev(int arr[], int n){
        for (int i = n-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void disp(int arr[], int n){
        for (int i = n-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array Operations\n1.Maximum\n2.Minimum\n3.Reverse\n4.Display\nEnter your choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                max(arr,n);
                break;
            
            case 2:
                min(arr,n);
                break;
            
            case 3:
                rev(arr,n);
                break;

            case 4:
                disp(arr,n);
                break;
            default:
            System.out.print("Wrong Choice");
                break;
        }
    sc.close();
    }
}