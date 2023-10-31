import java.util.Scanner;
class largecond{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int n3 = sc.nextInt();

        int large  = (n1>n2) ? (n1>n3?n1:n3) : (n2>n3?n2:n3);
        System.out.println("Largest number is :"+large);
        sc.close();
    }
} 