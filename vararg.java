import java.util.Scanner;
class vararg {

    static void avg(int ... arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double ave = sum/(arr.length-1);
        System.out.println("Average: "+ave);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" element: ");
            arr[i]=sc.nextInt();
        }

        avg(arr);        
        sc.close();
    }
    
} 

    

