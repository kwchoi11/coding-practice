import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (char c : myStr.toCharArray()) {
            if (c == 'a' || c == 'b' || c == 'c') {
                if (sb.length() > 0) {
                    result.add(sb.toString());
                    sb = new StringBuilder();
                }
            } else {
                sb.append(c);
            }
        }
        
        if (sb.length() > 0) {
            result.add(sb.toString());
        }
        
        if (result.isEmpty()) {
            return new String[]{"EMPTY"};
        } else {
            return result.toArray(new String[0]);
        }
    }
}