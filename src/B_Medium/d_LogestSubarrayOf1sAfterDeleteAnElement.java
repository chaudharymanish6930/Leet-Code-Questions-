package B_Medium;

public class d_LogestSubarrayOf1sAfterDeleteAnElement {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zero =0;
        int maxlen =0;

        for(int right=0; right <nums.length; right++){
            if(nums[right] ==0 ){
                zero++;
            }

            while(zero>1){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            maxlen = Math.max(maxlen, right - left);
        }
        return maxlen;
    }
}
