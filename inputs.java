import java.util.Scanner;
class inputs {
    
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a and b:");
        a = sc.nextInt();
        b = sc.nextInt();
        c=a+b;
        System.out.println("Sum = "+c);
        sc.close();
    }
    
}
