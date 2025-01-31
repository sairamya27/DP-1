class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        int dp[][] = new int[nums.length][2];
        dp[0][1] = nums[0];
        
        for(int i=1;i<nums.length;i++){
            //don't choose
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]);    
            //choose
            dp[i][1] = dp[i-1][0]+nums[i];
        }
        return Math.max(dp[nums.length-1][0],dp[nums.length-1][1]);
    }
    
}