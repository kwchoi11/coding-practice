import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> x = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                x.add(arr[i]);
            }
        }
        
        int[] answer = new int[x.size()];
        for (int i = 0; i < x.size(); i++) {
            answer[i] = x.get(i);
        }
        
        return answer;
    }
}