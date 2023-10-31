import java.util.Scanner;
class triangles {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sides of triangles in cm : ");
        int s1= sc.nextInt();
        int s2= sc.nextInt();
        int s3= sc.nextInt();
        sc.close();

        if(s1==s2 && s2==s3){
            System.out.println("Equilateral");
        }

        else if(s1==s2 || s2==s3 || s1==s3){
            System.out.println("Isoscelus");
        }

        else{
            System.out.println("Scalene");
        }
    }
}
