class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String concated=s+s;
        if(concated.contains(goal)){
            return true;
        }else{
            return false;
        }
    }
}