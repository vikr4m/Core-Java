import java.util.Scanner;
class distconv {
    public static void main(String args[])    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in meter: ");
        double m = sc.nextFloat();
        double f = m * 3.281;
        System.out.println("The distance in feet is: "+f);
        sc.close();

    }
}
