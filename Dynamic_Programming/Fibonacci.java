public class Fibonacci {
    public static int memoize[];
    public static void main(String[] args) {
        int n = 5;
        memoize = new int[n+1];
        System.out.println(fib(n));
        System.out.println(fibMemoizationTechnique(memoize, n));
        System.out.println(fibTabulationTechnique(n));
    }

    public static int fib(int n) {
        if(n < 2) {
            return n;
        } 
        return fib(n - 1) + fib(n - 2);
    }

    public static int fibMemoizationTechnique(int[] memoize, int n) {
        if(n < 2) {
            return n;
        }
        if(memoize[n] != 0) {
            return memoize[n];
        }
        memoize[n] = fibMemoizationTechnique(memoize, n-1) + fibMemoizationTechnique(memoize, n-2);
        return memoize[n];
    }

    public static int fibTabulationTechnique(int n) {
        if(n == 0) return 0;
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i - 2];
        }
        return dp[n];
    }
}