import java.util.Scanner;
class switchcalc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double result;

        System.out.print("Enter 1st number: ");
        double n1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        double n2 = sc.nextInt();

        System.out.print("Enter operator (+,-,*,/): ");
        char ch= sc.next().charAt(0);
        sc.close();
        switch(ch){
            case '+':
            result= n1+n2;
            break;

            case '-':
            result= n2-n1;
            break;

            case '*':
            result= n1*n2;
            break;

            case '/':
            result= n1/n2;
            break;

            default:
            System.out.println("Wrong operator.");
            return;
        }
        
        System.out.println(n1+" "+ch+" "+n2+" = "+result);
        
    }
    
}
