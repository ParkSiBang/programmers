class Solution {
    public String solution(int age) {
        String ageStr = String.valueOf(age);
        StringBuilder sb = new StringBuilder();
        for (char ch : ageStr.toCharArray()) {
            int digit = ch - '0';
            sb.append((char) ('a' + digit));
        }
        return sb.toString();
    }
}
