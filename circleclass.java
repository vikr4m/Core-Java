import java.util.Scanner;
class circle{
    Scanner sc = new Scanner(System.in);
    double r,a,c;
    
    void getr(){
        System.out.print("Enter the radius of circle: ");
        r = sc.nextDouble();
    }

    void area(){
        a = 3.14*r*r;
    }

    void circumference(){
        c = 2*3.14*r;
    }
    
    void disp(){
        System.out.print("Circumference of the circle is: "+c);
        System.out.print("\nArea of the circle is: "+a);
    }

}
class circleclass {
    public static void main(String args[]){
        circle c1 = new circle();
        c1.getr();
        c1.circumference();
        c1.area();
        c1.disp();
    }
}
