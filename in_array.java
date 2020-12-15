import java.util.Scanner;
import java.util.Arrays;
class insert{
    public void addb(int a[],int n,int b,int pos){
        for(int i = n-1; i>pos;i--){
            a[i] = a[i-1];
        }
        a[pos] = b;
    }
    
    public void see(int[] a1){
        System.out.println(Arrays.toString(a1));
    }
}

public class in_array {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        insert in = new insert();
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the element in the array");
        for(int i=0;i<n-1;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be inserted");
        int b = sc.nextInt();
        System.out.println("Enter the index value where element should be inserted");
        int pos = sc.nextInt();
        System.out.println("Original Array:");
        in.see(a);
        in.addb(a,n,b,pos);
        System.out.println("Array after insertion");
        in.see(a);
        sc.close();
    }
}
