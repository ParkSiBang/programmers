class Solution {
    public int solution(String myString, String pat) {
        StringBuilder converted = new StringBuilder();
        
        for (char ch : myString.toCharArray()) {
            converted.append(ch == 'A' ? 'B' : 'A');
        }
        
        return converted.toString().contains(pat) ? 1 : 0;
    }
}
