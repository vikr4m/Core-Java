import java.util.Scanner;
class studentc {
public static void main(String args[]){
    int n,i,enroll;
    boolean found = false;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter number of students: ");
    n = sc.nextInt();
    

    stu st[] = new stu[n];
    result rs[] = new result[n];

    for(i=0;i<n;i++){
        st[i] = new stu();
        rs[i] = new result();
        st[i].getstudata();
        rs[i].getresult(); 
    }
    
    System.out.print("Enter enroll number to be searched: ");
    enroll = sc.nextInt();
    
    for(i=0;i<n;i++){
        if(enroll==st[i].enroll){
            found = true;
            break;
        }
    }

    if(found == true){
        rs[i].dispresult(st, i);
    }
    else{
        System.out.println("Not found");
    }
    
    
    }    
    
}
class stu{
    int enroll,sem;
    String name;
    Scanner sc = new Scanner(System.in);

    void getstudata(){
        System.out.print("Enter student enrollment: ");
        enroll =sc.nextInt();
        System.out.print("Enter student name: ");
        name =sc.next();
        System.out.print("Enter student semester: ");
        sem =sc.nextInt();
        
    }
}

class result{
    int enroll,sem;
    double cpi,spi;
    Scanner sc = new Scanner(System.in);

    void getresult(){
        System.out.print("Enter student enrollment: ");
        enroll =sc.nextInt();
        System.out.print("Enter student semester: ");
        sem =sc.nextInt();
        System.out.print("Enter student CPI: ");
        cpi =sc.nextDouble();
        System.out.print("Enter student SPI: ");
        spi =sc.nextDouble();
        
    }

    void dispresult(stu st[],int i){
        System.out.println("Enrollment no: "+enroll);
        System.out.println("Name: "+st[i].name);
        System.out.println("Semester: "+st[i].sem);
        System.out.println("CPI: "+cpi);
        System.out.println("SPI: "+spi);
    }    
}