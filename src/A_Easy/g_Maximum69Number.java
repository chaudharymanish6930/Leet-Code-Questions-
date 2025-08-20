package A_Easy;

public class g_Maximum69Number {
    public int maximum69Number (int num) {
        // Convert number to string
        String numStr = String.valueOf(num);

        // Replace the first '6' with '9' only once
        numStr = numStr.replaceFirst("6", "9");

        // Convert back to integer
        return Integer.parseInt(numStr);
    }
}
