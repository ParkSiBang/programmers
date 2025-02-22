class Solution {
    public int solution(int[] num_list) {
        int oddSum = 0;  // 홀수 번째 원소들의 합
        int evenSum = 0; // 짝수 번째 원소들의 합

        for (int i = 0; i < num_list.length; i++) {
            if ((i + 1) % 2 == 1) { // 1-based index에서 홀수 번째
                oddSum += num_list[i];
            } else { // 1-based index에서 짝수 번째
                evenSum += num_list[i];
            }
        }

        return Math.max(oddSum, evenSum);
    }
}
