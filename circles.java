import java.util.Scanner;
class circles {
    public static void main (String[] args){
        int r;
        double pi=3.14, a, c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius of circle:");
        r = s.nextInt();
        a = pi*r*r;
        c = 2*pi*r;
        System.out.print("Area:"+a+" Circumference:"+c);
        s.close();
    }
}
