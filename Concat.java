import java.util.Arrays;
import java.util.Scanner;

class concat1{
    public void arrConcat(int[] array1,int[] array2, int length){
        int[] result = new int[length];
        int pos = 0;
        for (int i=0;i<array1.length;i++) {
            result[pos] = array1[i];
            pos++;
        }

        for (int i=0;i<array2.length;i++) {
            result[pos] = array2[i];
            pos++;
        }
        System.out.println("Concated array");
        System.out.println(Arrays.toString(result));
    }
}

public class Concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        concat1 ca = new concat1();
        System.out.print("Enter the size of array1");
        int n = sc.nextInt();
        int[] array1 = new int[n];
        System.out.println("Enter the elements of array1");
        for(int i=0; i<n;i++){
            array1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of array2");
        int l = sc.nextInt();
        int[] array2 = new int[l];
        System.out.println("Enter the element of array2");
        for(int i=0;i<l;i++){
            array2[i] = sc.nextInt();
        }
        sc.close();

        int length = array1.length + array2.length;
        ca.arrConcat(array1, array2, length);
    }
}
