import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 0, 5);
    }
}

