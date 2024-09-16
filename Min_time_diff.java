public class Min_time_diff {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> list = new ArrayList<>() ;
        int n = timePoints.size() ;
        for(String str : timePoints){
            int hr = Integer.parseInt(str.substring(0,2)) ;
            int min = Integer.parseInt(str.substring(3)) ;
            int totalMin  = hr*60 + min ;
            list.add(totalMin) ;
        }
        Collections.sort(list) ;
        int min = (int)1e9 ;
        for(int i=0 ; i<n-1 ; i++){
            min = Math.min(min , list.get(i+1) - list.get(i)) ;
        }
        min = Math.min(min , 24*60 + list.get(0) - list.get(n-1) ) ;
        return min ;
    }
}
