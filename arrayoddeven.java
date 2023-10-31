import java.util.Scanner;
class arrayoddeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        int odd=0 , even=0;
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+(i+1)+" :");
            a[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0)
                even++;
            else if(a[i]%2!=0)
                odd++;
            else
                break;    
        }
        System.out.print("Odd number count :"+odd);
        System.out.print("\nEven number count :"+even);
        
        sc.close();
    }
}