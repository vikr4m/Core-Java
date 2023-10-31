import java.util.Scanner;
class selectionsort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int temp=0;
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int a[]= new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter element: ");
            a[i]= sc.nextInt();
        }
        
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }   
            
        }
        System.out.print("Sorted array :\n");
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }

        sc.close();
    }
}
