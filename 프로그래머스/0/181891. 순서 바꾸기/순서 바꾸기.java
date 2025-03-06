import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len];

        // n번째 이후 원소들을 앞쪽에 복사
        System.arraycopy(num_list, n, answer, 0, len - n);
        // n번째까지의 원소들을 뒤쪽에 복사
        System.arraycopy(num_list, 0, answer, len - n, n);
        
        return answer;
    }
}
