public class Solution {
    public int solution(String num_str) {
        int sum = 0;
        for (char c : num_str.toCharArray()) {
            sum += c - '0'; // 문자형 숫자를 정수로 변환하여 더함
        }
        return sum;
    }
}
