class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        
        int abValue = Integer.parseInt(ab);
        int doubleAb = 2 * a * b;
        
        if (abValue >= doubleAb) {
            return abValue;
        } else {
            return doubleAb;
        }
    }
}