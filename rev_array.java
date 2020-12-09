import java.util.Scanner;
import java.util.Arrays;

class reverse{
    public int[] rev(int[] a, int n){
        int[] b = new int[a.length];
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        }
        return b;
    }
    public void see(int[] a){
        System.out.println(Arrays.toString(a));
    }
}

public class rev_array {
    public static void main(String[] args){
        reverse r = new reverse();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the element of an array");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Original array");
        r.see(a);
        int[] re = r.rev(a, n);
        System.out.println("Reversed array");
        r.see(re);
        sc.close();
    }
}
