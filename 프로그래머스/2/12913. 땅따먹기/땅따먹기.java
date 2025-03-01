import java.util.*;

class Solution {
    int solution(int[][] land) {
        int answer = 0;
        
        for (int i = 1; i < land.length; i++) {
            for(int j = 0; j < 4; j++) {
                int max = 0;
                int max_k = -1;
                for (int k = 0; k < 4; k++) {
                    if (j != k && land[i-1][k] > max) {
                        max_k = k;
                        max = land[i-1][k];
                    }
                }
                land[i][j] = land[i][j] + land[i-1][max_k];
            }
        }
        
        for (int i = 0; i < 4; i++) {
            if (land[land.length-1][i] > answer) {
                answer = land[land.length-1][i];
            }
        }
        
        return answer;
    }
}