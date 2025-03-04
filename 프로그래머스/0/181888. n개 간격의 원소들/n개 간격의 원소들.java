import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> resultList = new ArrayList<>();
        
        for (int i = 0; i < num_list.length; i += n) {
            resultList.add(num_list[i]);
        }
        
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
