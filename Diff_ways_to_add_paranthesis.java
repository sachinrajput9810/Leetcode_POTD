import java.util.* ;
class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        return solve(expression) ;
    }
    public List<Integer> solve(String exp){
        int n = exp.length() ;
        List<Integer> res = new ArrayList<>() ;
        for(int i=0 ; i<n ; i++){
            if(exp.charAt(i) == '+' || exp.charAt(i) == '-' || exp.charAt(i) == '*'){
                List<Integer> left = solve(exp.substring(0,i)) ;
                List<Integer> right = solve(exp.substring(i+1)) ;
                for(int val1 : left){
                    for(int val2 : right){
                        if(exp.charAt(i) == '+'){
                            res.add(val1+val2) ;
                        }
                        else if(exp.charAt(i) == '-'){
                            res.add(val1 - val2) ;
                        }
                        else res.add(val1*val2) ;
                    }
                }
            }
        }
        if(res.size() == 0) res.add(Integer.parseInt(exp)) ;
        return res ;
    }
}