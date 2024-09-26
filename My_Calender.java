class MyCalendar {
    HashMap<Integer , Integer> map ;
    public MyCalendar() {
        map = new HashMap<>() ;
    }
    
    public boolean book(int start, int end) {
        boolean ans = false ;
        if(!map.isEmpty()){
            for(int key : map.keySet()){
                int ks = key ;
                int ke = map.get(key) ;
                if( ke < start || ks >= end ) { continue ; }
                else return false ;
            }
            map.put(start , end-1) ;
            return true ;
        }
        else{
            map.put(start , end-1) ;
            ans = true ;
        }
        return ans ;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */