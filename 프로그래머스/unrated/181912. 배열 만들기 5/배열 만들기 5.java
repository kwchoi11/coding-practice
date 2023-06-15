import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();
        
        for (String str : intStrs) {
            if (str.length() >= s + l) {
                String subStr = str.substring(s, s + l);
                int num = Integer.parseInt(subStr);
                if (num > k) {
                    result.add(num);
                }
            }
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}