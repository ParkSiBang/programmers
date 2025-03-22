import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int k) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (k % 2 == 1) { // 홀수이면 곱하기
                result[i] = arr[i] * k;
            } else { // 짝수이면 더하기
                result[i] = arr[i] + k;
            }
        }

        return result;
    }
}
