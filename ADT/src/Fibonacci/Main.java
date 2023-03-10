package Fibonacci;

public class Main {
    public static void main(String[] args) {
        int N=20;
        int[] memo=new int[N+1];
        int resultByTop=fib(N,memo);
        int resultByBottom=fib(N);
        System.out.println(resultByTop);
        System.out.println(resultByBottom);
    }

    static int fib(int N,int[] memo){
        if (N==1||N==2){
            return 1;
        }
        if (memo[N] == 0) {
            memo[N] = fib(N - 1, memo) + fib(N - 2, memo);
        }
        return memo[N];
    }

    static int fib(int N){
        if (N==0){
            return 0;
        }
        if (N==1||N==2){
            return 1;
        }
        int[] dp=new int[N+1];
        dp[1]=dp[2]=1;
        for (int i=3;i<=N;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[N];
    }
}
