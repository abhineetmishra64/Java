import java.util.Scanner;

class matrix1{
    public void display(int matrix[][]){
        System.out.println("Matrix is:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

public class matrixi {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        matrix1 mt = new matrix1();
        System.out.println("Enter the no. of coloumn and rows of matrix");
        int n = sc.nextInt();
        System.out.println("Enter the element of a matrix");
        int[][] matrix1 = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        sc.close();
        mt.display(matrix1);
    }    
}
