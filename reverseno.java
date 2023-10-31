import java.util.Scanner;
class reverseno {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int reverse=0;

        System.out.print("Enter a number:");
        int a= sc.nextInt();

        while(a!=0){
            int temp = a%10;
            reverse = reverse * 10+temp;
            a = a/10;
        }
        System.out.println("Reverse number: "+reverse);
        sc.close();

    }
}
