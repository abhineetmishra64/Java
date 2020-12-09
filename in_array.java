import java.util.Scanner;
import java.util.Arrays;
class insert{
    public int[] addb(int a[],int n,int b){
        int a1[] = new int[a.length+1];
        for(int i=0;i<n;i++){
            a1[i] = a[i];
        }
        a1[n]=b;
        return a1;
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
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be inserted");
        int b = sc.nextInt();
        System.out.println("Original Array:");
        in.see(a);
        int[] newarr = in.addb(a, n, b);
        System.out.println("Array after insertion");
        in.see(newarr);
        sc.close();
    }
}
