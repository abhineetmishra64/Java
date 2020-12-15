import java.util.Scanner;
import java.util.Arrays;

class reverse{
    public void rev(int[] a, int n){
        int i,t; 
        for (i = 0; i < n / 2; i++) { 
            t = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = t; 
        } 
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
        r.rev(a, n);
        System.out.println("Reversed array");
        r.see(a);
        sc.close();
    }
}
