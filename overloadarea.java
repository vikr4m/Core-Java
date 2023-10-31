import java.util.Scanner;
class overloadarea {
    static void area(double rad){
        double area= 3.14*rad*rad;
        System.out.print("Area:"+area);
    }

    static void area(double base, double height){
        double area= base * height * 0.5;
        System.out.print("Area:"+area);
    }

    static void area(float side){
        double area= side*side;
        System.out.print("Area:"+area);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Figures:\n1.Circle\n2.Triangle\n3.Square\nEnter your choice: ");
        int ch = sc.nextInt();

        switch(ch){
            case 1:
            System.out.print("Enter radius: ");
            double rad= sc.nextDouble();
            area(rad);
            break;

            case 2:
            System.out.print("Enter base: ");
            double base= sc.nextDouble();
            System.out.print("Enter height: ");
            double height= sc.nextDouble();
            area(base,height);
            break;

            case 3:
            System.out.print("Enter side: ");
            float side= sc.nextFloat();
            area(side);
            break;

            default:
            System.out.println("Wrong choice");
            break;
        }
        sc.close();
    }
}