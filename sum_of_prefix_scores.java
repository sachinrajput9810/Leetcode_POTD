class Solution {
    public int[] sumPrefixScores(String[] words) {
        HashMap<String , Integer> map = new HashMap<>() ;
        for(String str : words){
            int i = 0 ;
            String s = "" ;
            while(i < str.length()){
                s += str.charAt(i) ;
                map.put(s , map.getOrDefault(s , 0) +1) ;
                i++ ;
            }
        }
        int n = words.length ;
        int res[] = new int[n] ;
        int  j = 0;
        for(String str : words){
            int i = 0 ;
            String s = "" ;
            int cnt = 0 ;
            while(i < str.length()){
                s += str.charAt(i) ;
                cnt += map.get(s) ;
                i++ ;
            }
            res[j++] = cnt ;
        }
        return res ;
    }
}