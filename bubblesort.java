import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of element: ");
        int n = sc.nextInt();   
        int a[]= new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter element: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Current array : ");
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }

        int temp=0;
        for(int i=1;i<a.length;i++){
            for(int j=0;j<a.length-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.print("\nSorted array:");
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }                 
        sc.close();
    }
}
