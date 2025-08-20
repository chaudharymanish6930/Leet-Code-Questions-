package A_Easy;

public class d_ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int a = 1; // ways for step 1-1 = 0 treated as 1
        int b = 2; // ways for step 2
        for (int i = 3; i <= n; i++) {
            int c = a + b; // ways(i) = ways(i-1) + ways(i-2)
            a = b;
            b = c;
        }
        return b;
    }
}

