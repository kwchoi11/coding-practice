class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        for (int i = 0; i < my_strings.length; i++) {
            String str = my_strings[i];
            int[] part = parts[i];
            
            int start = part[0];
            int end = part[1];
            
            String substring = str.substring(start, end + 1);
            answer += substring;
        }
        
        return answer;
    }
}