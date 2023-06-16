class Solution {
    public int solution(String my_string, String is_prefix) {
        // '접미사인지 확인하기' 문제의 다른 사람 풀이에서 
        // endsWith() 메서드를 보고 startsWith()도 있지 않을까? 했는데 있다 !
        if (my_string.startsWith(is_prefix)) {
            return 1;
        } else {
            return 0;
        }        
    }
}