class Solution {
    public int solution(int n) {
        return n / gcd(n, 6);
    }
    
    // 유클리드 호제법을 이용한 최대공약수 계산
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
