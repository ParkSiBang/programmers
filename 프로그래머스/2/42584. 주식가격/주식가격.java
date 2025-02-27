import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < prices.length; i++) {
            int time = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] > prices[j]) {
                    time += 1;
                    break;
                }
                time += 1;
            }
            list.add(time);
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}