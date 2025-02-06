class Solution {
    public int solution(String my_string) {
        int sum = 0;
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += c - '0'; // 문자 숫자를 정수로 변환 후 더하기
            }
        }
        return sum;
    }
}
