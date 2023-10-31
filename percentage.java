import java.util.Scanner;
class percentage {
    public static void main(String[] args){
        float a,b,c,d,e;
        double total,percent;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects:");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = sc.nextFloat();
        e = sc.nextFloat();

        total = a+b+c+d+e;
        percent = (total/500) * 100;

        System.out.println("Total Marks :"+total+"\nPercentage obtained :"+percent);
        sc.close();
    }
}
