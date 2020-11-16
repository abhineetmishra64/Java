import java.util.Scanner;
public class array{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        array ar = new array();
        System.out.print("Enter the size of array");
        int n = scan.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0; i<n;i++){
            a[i] = scan.nextInt();
        }
        scan.close();
        for(int j=0;j<n;j++){
            for(int i=j+1;i<n;i++){
                if(a[j]>a[i]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        }
        ar.see(n,a,b);
    }

    public void see(int n,int a[],int b[]){
        System.out.println("Array in asscending order");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("Array in descending order");
        for(int i=0;i<n;i++){
            System.out.println(b[i]);
        }
    }
}