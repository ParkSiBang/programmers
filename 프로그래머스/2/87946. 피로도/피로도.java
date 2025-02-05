import java.util.*;

class Solution {
    int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length]; // 방문 체크 배열
        permute(dungeons, visited, k, 0);
        
        return answer;
    }

    public void permute(int[][] dungeons, boolean[] visited, int k, int cnt) {
        answer = Math.max(answer, cnt);
        
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                if (k >= dungeons[i][0]) {
                    permute(dungeons, visited, k - dungeons[i][1], cnt + 1);
                }
                visited[i] = false;
            }
        }
    }
}