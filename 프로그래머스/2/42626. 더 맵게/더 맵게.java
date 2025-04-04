import java.util.*;

class Solution {
    public int solution(int[] scoville, int k) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }
        
        while (pq.size() > 1) {
            int s1 = 0;
            int s2 = 0;
            
            if (pq.peek() < k) {
                s1 = pq.poll();
                s2 = pq.poll();
                
                int new_s = s1 + (s2 * 2);
                pq.add(new_s);
                answer += 1;
            } else {
                break;
            }
        }
        
        if (pq.size() == 1 && pq.peek() < k) {
            return -1;
        }
        
        return answer;
    }
}