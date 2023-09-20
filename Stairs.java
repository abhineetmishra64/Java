import java.util.Scanner;

public class Stairs {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int totalWay = climbStair(A);
        System.out.println(totalWay);
        scn.close();
    }

    public static int climbStair(int A){
        int dp[] = new int[A+1];
        if(A == 0) return 1;
        dp[0] = 1;
        dp[1] = 2;
        for(int i = 2; i < A; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[A-1];
    }
}
