import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        
        char[] my_arr = my_string.toCharArray();
        Arrays.sort(my_arr);
        
        String answer = new String(my_arr);
        return answer;
    }
}