import java.util.Scanner;
class arraysearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of element: ");
        int n= sc.nextInt();
        int a[]= new int[n];
        String message="Number not found";

        for(int i=0;i<a.length;i++){
            System.out.print("Enter array element: ");
            a[i]= sc.nextInt();
        }

        System.out.print("Enter number you want to search: ");
        int sear= sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==sear){
                message="Number found at "+(i+1);
                break;
            }
            
        }
        System.out.println(message);
        sc.close();
    }
}
