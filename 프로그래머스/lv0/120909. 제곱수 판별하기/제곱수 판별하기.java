class Solution {
    public int solution(int n) {
        double squareRoot = Math.sqrt(n);

        if (squareRoot == (int) Math.sqrt(n)) {
            return 1;
        } else {
            return 2;
        }
    }
}