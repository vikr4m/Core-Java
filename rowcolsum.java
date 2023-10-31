import java.util.Scanner;
class rowcolsum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of row: ");
        int row = sc.nextInt();
        System.out.print("Enter number of column: ");
        int col = sc.nextInt();

        int a[][] = new int[row][col];
        int rowSum[] = new int[row];
        int colSum[] = new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter a["+(i+1)+"]["+(j+1)+"]: ");
                a[i][j]= sc.nextInt();
            }

        }
        for(int i=0;i<row;i++){
            rowSum[i]=colSum[i]=0;
            
        }
        sc.close();
    }
}
