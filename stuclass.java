import java.util.Scanner;
class student{
    int enroll,sem;
    double cpi,spi;
    String name;

    Scanner sc = new Scanner(System.in);
    void getdata(){
        System.out.print("Enter enrollment number: ");
        enroll = sc.nextInt();
        System.out.print("Enter student name: ");
        name = sc.next();
        System.out.print("Enter semester: ");
        sem = sc.nextInt();
        System.out.print("Enter CPI: ");
        cpi = sc.nextDouble();
        System.out.print("Enter SPI: ");
        spi = sc.nextDouble();
    }
    void dispdata(){
        System.out.println("\nStudent Details");
        System.out.println("Name: "+name);
        System.out.println("Enrollment number: "+enroll);
        System.out.println("Semester: "+sem);
        System.out.println("CPI: "+cpi);
        System.out.println("SPI: "+spi);
        sc.close();
        
    }
    
}
class stuclass {
    public static void main(String args[]){
        student s = new student();
        s.getdata();
        s.dispdata();
    }
}
