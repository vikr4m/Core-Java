import java.util.Scanner;
class divi2no3 {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st number for range: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number for range: ");
        int n2 = sc.nextInt();
        sc.close();

        for(int i=n1;i<n2;i++){
            if(i%2==0 && i%3!=0)
                System.out.print(i+" ");
        }
    }
}
