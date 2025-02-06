class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[128];
        
        for (char c : my_string.toCharArray()) {
            if (!visited[c]) {
                visited[c] = true;
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
