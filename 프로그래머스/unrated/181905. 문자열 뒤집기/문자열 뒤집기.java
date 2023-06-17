class Solution {
    public String solution(String my_string, int s, int e) {
        char[] charArray = my_string.toCharArray(); // 문자열을 문자 배열로 변환
        
        // 인덱스 s부터 인덱스 e까지의 문자를 뒤집음
        while (s < e) {
            char temp = charArray[s];
            charArray[s] = charArray[e];
            charArray[e] = temp;
            s++;
            e--;
        }
        
        return new String(charArray); // 문자 배열을 문자열로 변환하여 반환.
    }
}