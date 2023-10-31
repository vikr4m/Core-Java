import java.util.Scanner;
class methfibo {
 
    static void fibo(int n){
        int n1 = 0, n2 = 1,n3;
        
        System.out.print(n1+" "+n2);
        for(int count=2;count<n;count++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }    
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for fibonacci series: ");
        int n = sc.nextInt();

        fibo(n);
        sc.close();
    }
}
