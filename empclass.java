import java.util.Scanner;
class employee1{
    int empid,age,salary;
    String empname, designation;

    Scanner sc = new Scanner(System.in);
    void getdata(){
        System.out.print("Enter employee ID: ");
        empid = sc.nextInt();
        System.out.print("Enter employee name: ");
        empname = sc.next();
        System.out.print("Enter employee designation: ");
        designation = sc.next();
        System.out.print("Enter employee age: ");
        age = sc.nextInt();
        System.out.print("Enter employee salary: ");
        salary = sc.nextInt();

        sc.close();

    }

    void dispdata(){
        System.out.println("\nEmployee Details");
        System.out.println("Employee ID: "+empid);
        System.out.println("Employee Name: "+empname);
        System.out.println("Employee Designation: "+designation);
        System.out.println("Employee age: "+age);
        System.out.println("Employee salary: "+salary);
    }

}
class empclass {
    public static void main(String args[]){
        employee1 e = new employee1();
        e.getdata();
        e.dispdata();
    }
}
