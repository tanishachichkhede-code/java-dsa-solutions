import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>result= new ArrayList<>();
        if(s.length()<p.length()){
            return result;
        }
        int pcount[] = new int[26];
        int windowcount[] = new int[26];
        for(int i=0;i<p.length();i++){
            pcount[p.charAt(i)-'a']++;
        }
        int left=0;
        for(int right=0;right<s.length();right++){
            windowcount[s.charAt(right)-'a']++;

            if(right>=p.length()){
                windowcount[s.charAt(left)-'a']--;
                left++;
            }
            if(Arrays.equals(pcount,windowcount)){
                result.add(left);
            }
        }
        return result;
    }
}