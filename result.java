import java.util.Scanner;
class result {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects :-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        double total = a+b+c+d+e;
        double percent = (total/500)*100;
        
        if(percent>=70){
            System.out.println("Distinction");
        }
        else if(percent>=60 && percent<=70){
            System.out.println("First class");
        }
        else if(percent>=45 && percent<=60){
            System.out.println("Second class");
        }
        else if(percent>=35 && percent<=45){
            System.out.println("Third class");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
