public class Solution {
    public int solution(String my_string, String is_prefix) {
        // my_string이 is_prefix로 시작하는지 확인
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }
}