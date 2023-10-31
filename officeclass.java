class member{
    String name,address;
    double salary;
    int age,pno;

    void printSalary(){
        System.out.print("Salary: "+salary+"\n");
    }
}

class employee extends member{
    String specialization;

    employee(String n, int a, int ph, String add, double s, String spe){
        name=n;
        age=a;
        pno=ph;
        address=add;
        salary=s;
        specialization = spe;
    }

    void displayemployee(){
        System.out.println("\nEmployee details");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone Number: "+pno);
        System.out.println("Address: "+address);
        printSalary();
        System.out.println("Specialization: "+specialization);
    }
}

class manager extends member{
    String department;
    manager(String n, int a, int ph, String add, double s, String dep){
        name=n;
        age=a;
        pno=ph;
        address=add;
        salary=s;
        department = dep;
    }

    void displaymanager(){
        System.out.println("\nManager details");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone Number: "+pno);
        System.out.println("Address: "+address);
        printSalary();
        System.out.println("Department: "+department);
    }
}

class officeclass {
    public static void main(String args[]){
        employee e1 = new employee("Shivam",24,7203958,"Anand",50000,"Finance");
        manager m1 =  new manager("Vikram",24,7869546,"Anand",70000,"HR");
        e1.displayemployee();
        m1.displaymanager();
    }
}
