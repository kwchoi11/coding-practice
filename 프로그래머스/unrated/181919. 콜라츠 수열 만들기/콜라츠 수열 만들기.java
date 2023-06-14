class Solution {
    public int[] solution(int n) {
        int[] answer = new int[1000];  // 콜라츠 수열의 최대 길이는 1000입니다.
        int count = 0;
        
        answer[count++] = n;  // 초기값 n을 수열에 추가합니다.
        
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            
            answer[count++] = n;  // 계산된 수를 수열에 추가합니다.
        }
        
        int[] result = new int[count];
        System.arraycopy(answer, 0, result, 0, count);  // 결과 배열을 새로 생성하여 수열의 길이에 맞게 복사합니다.
        
        return result;
    }
}
