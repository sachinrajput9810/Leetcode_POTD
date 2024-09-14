class Solution {
    public int longestSubarray(int[] nums) {
        int max = -1 ;
        for(int val : nums) max = Math.max(max , val) ;
        int i = 0 ;
        int n = nums.length ;
        int len = 0 ;
        int ans = 0 ;
        while(i < n){
            int val = nums[i] ;
            if(val == max){
                len += 1 ;
                ans = Math.max(ans , len) ;
            } 
            else{
                len = 0 ;
            }
            i++ ;
        }
        return ans ;
    }
}

// sept 14