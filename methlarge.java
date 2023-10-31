import java.util.Scanner;
class methlarge {
    static void large(int a, int b){
        if(a>b)
            System.out.println("1st number ("+a+") is greater.");
        
        else if(b>a)
        System.out.println("2nd number ("+b+") is greater.");

        else
        System.out.println("Both numbers are equal.");

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        large(a,b);
        sc.close();
    }
}
