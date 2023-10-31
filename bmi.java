import java.util.Scanner;
class bmi {
    public static void main(String args[]){
        double w,h,bmi;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your height in inches: ");
        h = sc.nextDouble();

        System.out.print("Enter your weight in pounds: ");
        w = sc.nextDouble();

        h= h*0.0254;
        w= w*0.45359237;
        bmi = w/(h*h);
        
        System.out.println("The Body Mass Index(BMI) is: "+bmi);
        sc.close();
    }    
}
