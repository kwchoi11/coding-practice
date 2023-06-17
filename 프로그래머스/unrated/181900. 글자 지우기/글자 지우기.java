import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder(my_string);
        
        // indices 배열을 오름차순으로 정렬
        Arrays.sort(indices);
        
        // 인덱스를 역순으로 순회하며 해당 위치의 문자를 삭제
        // 인덱스를 지우는 작업을 수행할 때 인덱스 위치가 변경되는 것을 방지하기 위함
        for (int i = indices.length - 1; i >= 0; i--) {
            answer.deleteCharAt(indices[i]);
        } 
      
        return answer.toString();
    }
}