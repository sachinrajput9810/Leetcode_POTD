class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length ;
        String[] arr = new String[n] ;
        for(int i=0 ; i<n ; i++){
            int val = nums[i] ;
            arr[i] = val + "" ;
        }
        Arrays.sort(arr , (a,b) -> (b+a).compareTo(a+b)) ;
        if(arr[0].equals("0")) return arr[0] ;
        String ans = "" ;
        for(String str : arr) ans = ans + str ;
        return ans ;
    }
}