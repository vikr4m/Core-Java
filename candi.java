import java.util.Scanner;
class Candidate{
    int candiid,candiage,candiweight;
    String candiname;
    double candiheight;

    Scanner sc = new Scanner(System.in);
    
    void getdata(){
        System.out.print("Enter candidate id: ");
        candiid = sc.nextInt();
        System.out.print("Enter candidate name: ");
        sc.nextLine();
        candiname= sc.nextLine();
        System.out.print("Enter candidate age: ");
        candiage = sc.nextInt();
        System.out.print("Enter candidate height: ");
        candiheight = sc.nextDouble();
        System.out.print("Enter candidate weight: ");
        candiweight = sc.nextInt();

    }

    void dispdata(){
        System.out.println("\nCANDIDATE DETAILS:\n");
        System.out.println("Candidate name : "+candiname);
        System.out.println("Candidate id : "+candiid);
        System.out.println("Candidate age : "+candiage);
        System.out.println("Candidate height : "+candiheight);
        System.out.println("Candidate weight : "+candiweight);
    }
    


}

class candi {
    public static void main(String args[]){
        Candidate cn = new Candidate();
        cn.getdata();
        cn.dispdata();
    }
}
