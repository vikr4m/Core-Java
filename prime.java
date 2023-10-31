import java.util.Scanner;
class prime {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int prime=0;

        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();

        for(int i=2;i<n;){
            if(n%i==0)
                prime=1;
                break;
        }

        if(prime==1)
            System.out.println("Number is not prime");
        
        else
            System.out.println("Number is prime");

        sc.close();

    }
}
