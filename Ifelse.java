import java.util.*;

public class Ifelse {
    public static void main(String[] args) {
        /***Don't change the code here***/
        
        Scanner inp  = new Scanner(System.in);
        int M = inp.nextInt();
        inp.close();
        /*********************************/
        
        /**Write your code here**/
        if(M%5 == 0 && M%3 == 0) System.out.println("Good Number");
        else if(M%5 == 0 && M%3 != 0) System.out.println("Poor Number");
        else if(M%3 == 0 && M%5 != 0) System.out.println("Bad Number");
        else System.out.println(-1);
        
        
    }
}