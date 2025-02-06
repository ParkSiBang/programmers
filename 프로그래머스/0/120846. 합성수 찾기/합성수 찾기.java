class Solution {
    public int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isComposite(i)) count++;
        }
        return count;
    }
    
    private boolean isComposite(int x) {
        int divisorCount = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                divisorCount++;
            }
            if (divisorCount >= 3) {
                return true;
            }
        }
        return false;
    }
}
