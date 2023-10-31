import java.util.Scanner;
class bankaccount{
    String accnumber,username,email,accounttype;
    double accountbalance;
    Scanner sc = new Scanner(System.in);

    void getdata(){
        System.out.print("\nEnter Account Number: ");
        accnumber = sc.next();
        System.out.print("Enter User Name: ");
        username = sc.next();
        System.out.print("Enter Email: ");
        email = sc.next();
        System.out.print("Enter Account Type: ");
        accounttype = sc.next();
        System.out.print("Enter Account Balance: ");
        accountbalance = sc.nextDouble();
    }

    void dispdata(){
        System.out.print("\nAccount Details\n");
        System.out.println("Account Number: "+accnumber);
        System.out.println("User Name: "+username);
        System.out.println("Email: "+email);
        System.out.println("Account Type: "+accounttype);
        System.out.println("Account Balance: "+accountbalance);
    }

    String search(String message, String accno, bankaccount bns){
        if(accno.equals(bns.accnumber)){
            message="Found";
        }
        return message;
    }

}

class bankacc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        bankaccount bn1 = new bankaccount();
        bankaccount bn2 = new bankaccount();
        bankaccount bn3 = new bankaccount();
        
        bn1.getdata();
        bn1.dispdata();
        bn2.getdata();
        bn2.dispdata();
        bn3.getdata();
        bn3.dispdata();
        
        String message = "Not found";
        System.out.print("Enter the account number to be searched: ");
        String accountno = sc.next();
        message = bn1.search(message, accountno, bn1);
        message = bn2.search(message, accountno, bn2);
        message = bn3.search(message, accountno, bn3);
        
        System.out.print(message);        
        sc.close();
    }
}
