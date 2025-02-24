import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        //String jinsu = "";
        //int quote = 0;
        //int remain = 0;
        
        // while (n > 0) {
        //     quote = n / k;
        //     remain = n % k;
        //     n = quote;
        //     jinsu = remain + jinsu;
        // }
        String jinsu = Integer.toString(n, k);
        String[] strArr = jinsu.split("0+");

        for (String str : strArr) {
            long p = Long.parseLong(str); 
            if (isPrime(p)) {
                answer += 1;
            }
        }
        
        return answer;
    }
    
    public boolean isPrime(long p) {
        if (p < 2) return false;
        if (p == 2) return true;
        if (p % 2 == 0) return false; // 짝수 빠르게 걸러내기

        for (long i = 3; i * i <= p; i += 2) { // 3부터 홀수만 검사
            if (p % i == 0) return false;
        }
        return true;
    }
    
}