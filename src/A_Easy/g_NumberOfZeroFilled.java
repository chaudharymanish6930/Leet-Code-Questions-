package A_Easy;

public class g_NumberOfZeroFilled {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;   // total number of zero-filled subarrays
        long streak = 0;  // current consecutive zero count

        for (int num : nums) {
            if (num == 0) {
                streak++;
                count += streak; // add subarrays ending at this index
            } else {
                streak = 0; // reset when non-zero
            }
        }
        return count;
    }

}
