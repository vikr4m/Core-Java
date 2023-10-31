import java.util.Scanner;
class arraydivi35 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n= sc.nextInt();

        int a[]= new int[n];
        int sum=0;
        for(int i=0;i<a.length;i++){
            System.out.print("Enter element :");
            a[i]=sc.nextInt();
            
            if(a[i]%3==0 || a[i]%5==0){
                sum=sum + a[i];
                
            }
        }
        System.out.print("Sum: "+sum);
        sc.close();
    }
}