import java.util.Scanner;
class largest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int n3 = sc.nextInt();

        if(n1>n2){
            if(n1>n3){
                System.out.println("1st number ("+n1+") is the largest");
            }
            else{
                System.out.println("3rd number ("+n3+") is the largest");
            }
        }
        else{
            if(n2>n3){
                System.out.print("2nd number ("+n2+") is the largest");
            }
            else{
                System.out.print("3rd number ("+n3+") is the largest");
            }
        }
        sc.close();
    }
}
