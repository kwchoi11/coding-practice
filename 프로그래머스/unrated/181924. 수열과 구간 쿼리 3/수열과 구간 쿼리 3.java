class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone(); // arr의 초기 순서를 유지하는 새로운 배열 생성
        
        for (int i = 0; i < queries.length; i++) {
            int queryI = queries[i][0];
            int queryJ = queries[i][1];
            
            int temp = answer[queryI];
            answer[queryI] = answer[queryJ];
            answer[queryJ] = temp;
        }
        
        return answer;
    }
}