import java.util.Scanner;
class martixarray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows in array: ");
        int r= sc.nextInt();
        System.out.print("Enter number of column in array: ");
        int c= sc.nextInt();

        int a[][]= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter ["+(i+1)+"]["+(j+1)+"] element :");
                a[i][j]= sc.nextInt();
            }
        }
        System.out.print("Array in matrix form:\n");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }        

        sc.close();
    }
}
