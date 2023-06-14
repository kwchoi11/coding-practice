class Solution {
    public int[] solution(int[] arr) {
        int[] stk = new int[arr.length];
        int top = -1; // 스택의 가장 위를 가리키는 인덱스 변수
        
        for (int i = 0; i < arr.length; i++) {
            if (top == -1 || stk[top] < arr[i]) {
                stk[++top] = arr[i];
            } else {
                while (top >= 0 && stk[top] >= arr[i]) {
                    top--;
                }
                stk[++top] = arr[i];
            }
        }
        
        int[] result = new int[top + 1];
        for (int i = 0; i <= top; i++) {
            result[i] = stk[i];
        }
        return result;
    }
}