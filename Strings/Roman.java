class Solution {
    public int romanToInt(String s) {
      int answe =0;
      for(int i=0;i<s.length()-1;i++){
        if(value(s.charAt(i))<value(s.charAt(i+1))){
            answer = answer - value(s.charAt(i));
        }else{
            answer = answer + value(s.length(i));
        }
      }  
      answer = answer + value(s.charAt(s.length()-1));
      return answer;
    }
    public int value(char c) {
        if (c == 'I') return 1;
        else if (c == 'V') return 5;
        else if (c == 'X') return 10;
        else if (c == 'L') return 50;
        else if (c == 'C') return 100;
        else if (c == 'D') return 500;
        else return 1000;
    }
}