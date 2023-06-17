class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k]; // k의 배수 개수만큼 배열 크기 생성
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (i + 1) * k;  // k의 배수를 오름차순으로 저장
        }
        
        return answer;
    }
}