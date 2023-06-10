class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int length = num_list.length;
        
        int lastValue = num_list[length - 1];
        int secondLastValue = num_list[length - 2];
        
        int newValue;
        if (lastValue > secondLastValue) {
            newValue = lastValue - secondLastValue;
        } else {
            newValue = lastValue * 2;
        }
        
        answer = new int[length + 1];
        for (int i = 0; i < length; i++) {
            answer[i] = num_list[i];
        }
        answer[length] = newValue;
        
        return answer;
    }
}