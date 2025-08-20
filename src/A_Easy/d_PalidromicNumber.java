package A_Easy;

public class d_PalidromicNumber {
    public boolean isPalindrome(int x) {
        if(x<0) return false;

        int original =x;
        int reverse = 0;
        while(x != 0){
            int y = x%10;
            reverse = reverse*10 + y;
            x /= 10;
        }
        return original == reverse;
    }
}
