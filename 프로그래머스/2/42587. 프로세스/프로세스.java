import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        // 1️⃣ 큐에 {우선순위, 인덱스} 형태로 저장
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{priorities[i], i});
        }

        // 2️⃣ 우선순위 내림차순 정렬을 위한 PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int priority : priorities) {
            priorityQueue.offer(priority);
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            
            if (current[0] == priorityQueue.peek()) { 
                priorityQueue.poll(); 
                answer++; 

                if (current[1] == location) {
                    return answer;
                }
            } else { 
                queue.offer(current);
            }
        }

        return answer;
    }
}
       