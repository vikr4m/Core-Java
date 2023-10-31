import java.util.Scanner;
class oddeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sumodd=0 ,sumeven=0;
        while(true){
            System.out.print("Enter number to add (0 to stop):");
            int n = sc.nextInt();

            if(n%2==0 && n>0)   
                sumeven += n;

            if(n%2!=0 && n<0)
                sumodd += n;
                
            if(n==0)
                break;
        }
        System.out.println("Negative Odd sum: "+sumodd+"\nPositiveEven sum:"+sumeven);

        sc.close();
    }
}
