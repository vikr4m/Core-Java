import java.util.Scanner;
class telebill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double amount;
        int call;
        
        System.out.print("Enter number of calls: ");
        call = sc.nextInt();
        sc.close();

        if(call<100)
            amount=200;
        else if(call>100 && call<=150)
            amount=200+(0.60*(call-100));
        else if(call>150 && call<=200)
            amount=200+(0.60*50)+(0.50*(call-150));
        else
            amount=200+(0.60*50)+(0.50*50)+(0.40*(call-200));
        
        System.out.println("The total amount: "+amount);
    }
    
}
