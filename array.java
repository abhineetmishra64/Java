import java.util.Scanner;
import java.util.Arrays;

class program{
    public void asc(int n, int [] a){
        for(int j=0;j<n;j++){
            for(int i=j+1;i<n;i++){
                if(a[j]>a[i]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    public int[] dsc(int n, int [] a){
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        }
        return b;
    }

    public void see(int n,int a[]){
        System.out.println(Arrays.toString(a));
    }
}

public class array{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n = scan.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0; i<n;i++){
            a[i] = scan.nextInt();
        }
        program pr = new program();
        System.out.println("Original array");
        pr.see(n,a);
        pr.asc(n,a);
        System.out.println("Array after sorting in ascending order");
        pr.see(n,a);
        int[] x = pr.dsc(n,a);
        System.out.println("Array after sorting in descending order");
        pr.see(n,x);
        scan.close(); 
    }
}
