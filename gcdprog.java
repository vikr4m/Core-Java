import java.util.Scanner;
class gcdprog {
    static int gcd(int num1, int num2){
        int gc=0;
        for(int i=1;i<=num1 && i<=num2; i++){
            if(num1%i==0 && num2%i==0){
                gc=i;
            }
        }
            return gc;
        }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        System.out.println("GCD of "+num1+" and "+num2+" : "+gcd(num1, num2));

        sc.close();
    }
}