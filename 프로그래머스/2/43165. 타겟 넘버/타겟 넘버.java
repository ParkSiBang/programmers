class Solution {
    int answer = 0;
    int[] numbers;
    int target = 0;
    public int solution(int[] input_numbers, int input_target) {
        numbers = input_numbers;
        target = input_target;
        cal(-1, 0);
        
        return answer;
    }
    
    public int cal(int idx, int sum) {
        if (idx == numbers.length - 1) {
            if (sum == target) {
                answer += 1;
            }
            return 0;
        }
 
        idx += 1;
        return cal(idx, sum + numbers[idx]) + cal(idx, sum - numbers[idx]);
    }
        
}