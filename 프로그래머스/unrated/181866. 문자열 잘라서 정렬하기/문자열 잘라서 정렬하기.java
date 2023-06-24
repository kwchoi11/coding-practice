import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] splitArr = myString.trim().split("x");
        Arrays.sort(splitArr);
        
        return splitArr;
    }
}
