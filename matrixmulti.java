import java.util.Scanner;
class matrixmulti{
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows in array : ");
        int r= sc.nextInt();
        System.out.print("Enter number of column in array : ");
        int c= sc.nextInt();

        int a[][]= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter a["+(i+1)+"]["+(j+1)+"] element :");
                a[i][j]= sc.nextInt();
            }
        }
        System.out.print("\n");

        int b[][]= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter b["+(i+1)+"]["+(j+1)+"] element :");
                b[i][j]= sc.nextInt();
            }
        }

        int c1[][]= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                c1[i][j] = (a[i][j] * b[i][j]);
            }
        }

        System.out.print("Multipied matix of a and b is: \n");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(c1[i][j]+" ");

            }
            System.out.print("\n");
        }
        sc.close();
    }
}