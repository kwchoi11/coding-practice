class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int product = 1;
        int sum = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            product = product * num_list[i];
            sum = sum + num_list[i];
            
            if (product < (sum * sum)) {
                answer = 1;
            } else if (product > (sum * sum)) {
                answer = 0;
            }
        }
        
        return answer;
    }
}