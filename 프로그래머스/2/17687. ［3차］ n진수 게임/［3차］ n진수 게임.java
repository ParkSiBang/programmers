import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        String str = "";
        int i = 0;
        while (true) {
            int num = i;
            String s = Integer.toString(num, n);
            str += s;
            
            if (str.length() > t * m) {
                break;
            }
            
            i += 1;
        }

        char[] arr = str.toCharArray();
        
        int seq = 0;
        int idx = 0;
        while (t > 0) {
            if (seq == p - 1) {
                answer += arr[idx];
                t -= 1;
            }
            if (seq == m - 1) {
                seq = 0;
            } else {
                seq += 1;
            }
            idx += 1;
        }
        
        answer = answer.toUpperCase();
        return answer;
    }
}