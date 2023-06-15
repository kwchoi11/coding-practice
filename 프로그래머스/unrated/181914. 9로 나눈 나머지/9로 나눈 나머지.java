class Solution {
    public int solution(String number) {
        int sum = 0;
        
        // 문자열을 숫자로 변환하고 각 자리 숫자의 합을 구함
        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            sum += digit;
        }
        
        // 각 자리 숫자의 합을 9로 나눈 나머지를 구함
        int remainder = sum % 9;
        
        return remainder;
    }
}