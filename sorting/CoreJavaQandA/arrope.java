package CoreJavaQandA;
import java.util.Scanner;
public class arrope {
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
            case 1:{
                int max=arr[0];
                for (int i = 1; i < n; i++) {
                    if(arr[i]>max){
                        max=arr[i];
                    }
                }
                System.out.println("Maximum: "+max);
            }
                break;
            
            case 2:{
                int min=arr[0];
                for (int i = 1; i < n; i++) {
                    if(arr[i]<min){
                        min=arr[i];
                    }
                }
                System.out.println("Minimum: "+min);
            }
                break;
            
            case 3:{
                for (int i = n-1; i >= 0; i--) {
                    System.out.print(arr[i]+" ");
                }
            }
                break;

            case 4:{
                for (int i = 0; i <= n-1; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
                break;
            default:
            System.out.print("Wrong Choice");
                break;
        }
    sc.close();
    }
}
