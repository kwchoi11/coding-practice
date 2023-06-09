class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for (int idx = 0; idx < code.length(); idx++) {
            char ch = code.charAt(idx);
            
            if (mode == 0) {
                if (ch != '1') {
                    if (idx % 2 == 0) {
                        answer += ch;
                    }
                } else {
                    mode = 1;
                }
            } else {
                if (ch != '1') {
                    if (idx % 2 != 0) {
                        answer += ch;
                    }
                } else {
                    mode = 0;
                }
            }
        }
        
        if (answer.equals("")) {
            answer = "EMPTY";
        }
        return answer;
    }
}