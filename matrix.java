import java.util.Scanner;

class matrix1{
    public int[][] sum(int r, int c, int matrix1[][], int matrix2[][]){
        int[][] sum = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }

    public int[][] diff(int r, int c, int matrix1[][], int matrix2[][]){
        int[][] diff = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                diff[i][j] = matrix1[i][j] - matrix2[i][j];
            } 
        }
        return  diff;
    }

    public int[][] multi(int r, int c, int matrix1[][], int matrix2[][]){
        int[][] multi = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                multi[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return multi;
    }

    public void display(int r, int c, int sum[][], int diff[][], int multi[][]){
        System.out.println("Sum of matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println(sum[i][j]);
            }

        }
        System.out.println("Difference of matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println(diff[i][j]);
            }
        }
        System.out.println("Product of matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println(multi[i][j]);
            }
        }
    }
}

public class matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        matrix1 mt = new matrix1();
        System.out.println("Enter no. of rows");
        int r = sc.nextInt();
        System.out.println("Enter no. of coloumn");
        int c = sc.nextInt();
        int[][] matrix1 = new int[r][c];
        int[][] matrix2 = new int[r][c];
        System.out.println("Enter the element in matrix 1: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements in matrix 2: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int[][] sum = mt.sum(r, c, matrix1, matrix2);
        int[][] diff = mt.diff(r,c,matrix1,matrix2);
        int[][] multi = mt.multi(r,c,matrix1,matrix2);
        mt.display(r, c, sum, diff, multi);     
    }
}
