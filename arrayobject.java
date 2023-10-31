import java.util.Scanner;
class studentdetail{
    int enroll,sem;
    String name;
    double cpi;
    Scanner sc = new Scanner(System.in);

    void getdata(){
        System.out.print("Enter student enrollment number: ");
        enroll = sc.nextInt();
        System.out.print("Enter student name: ");
        name = sc.next();
        System.out.print("Enter student semester: ");
        sem = sc.nextInt();
        System.out.print("Enter student cpi: ");
        cpi = sc.nextDouble();
    }

    void display(){
        System.out.println("\nStudent Details");
        System.out.println("Student Enrollment number: "+enroll);
        System.out.println("Student Name: "+name);
        System.out.println("Student Semester: "+sem);
        System.out.println("Student Enrollment CPI: "+cpi);
    }
    
}
class arrayobject {
    public static void main(String args[]){
        int i,n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of students: ");
            n = sc.nextInt();

            studentdetail sd[] = new studentdetail[n];

            for(i=0;i<n;i++){
                sd[i] = new studentdetail();
                System.out.println("Enter student "+(i+1)+" details");
                sd[i].getdata();
            }
            for(i=0;i<n;i++){
                sd[i].display();
            }
            sc.close();
        }
    }
}
