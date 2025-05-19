import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

       for(int i=0;i<s.length();i++){
        Integer a=romanValues.get(s.charAt(i));
        if(i<s.length()-1 && a<romanValues.get(s.charAt(i+1))){
           result=result-a; 
        }
        else
             result=result+a;
       }

        return result;
    }
}