import java.util.Scanner;
class fractionsum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double sum=0;

        System.out.print("Enter number 1/n :");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            sum = sum + 1.0/i;
        }
        System.out.println("Sum: "+sum);
        sc.close();
    }

}
