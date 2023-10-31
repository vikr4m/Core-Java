import java.util.Scanner;
class tempconv {
    public static void main(String[] args){
    float t,c;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter temp. in farenheit:");
    t = sc.nextFloat();

    c = (t-32)*(9f/5);
    System.out.println("Temprature "+t+" farenheit in celsius is "+c);

    sc.close();
}
}
