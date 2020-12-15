import java.util.Arrays;
import java.util.Scanner;

class process{
    public void delete(int n, int[] a, int x){
        for(int i=0;i<n;i++){
            if(x==a[i]){
                int key = i;
                for (int k = 0, j = 0; k<a.length; k++) {
                    if (k != key) {
                        a[j++] = a[k];
                    }
                }
                a[a.length - 1] = 0;
            }
        }
    }
    public void see(int[] a){
        System.out.println(Arrays.toString(a));
    }
}

public class array1 {
    public static void main(String []args){
        Scanner sc =  new Scanner(System.in);
        process pr = new process();
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the element of array");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Array before deleting an element");
        pr.see(a);
        System.out.println("Enter the value that should be deleted");
        int x = sc.nextInt();
        sc.close();
        pr.delete(n,a,x);
        System.out.println("Array after deleting an element");
        pr.see(a);
    }
}
