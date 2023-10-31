import java.util.Scanner;
class simpleinterest {    
    static void inter(double amount, double roi, double years){
        double si= amount*roi*years;
        System.out.println("Simple interest= "+si);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter ROI: ");
        double roi = sc.nextDouble();
        System.out.print("Enter years: ");
        double years = sc.nextDouble();
        sc.close();

        inter(amount,roi,years);
    }
}
