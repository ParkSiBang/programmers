class Solution {
    public int solution(int num, int k) {
        String strNum = String.valueOf(num);
        String strK = String.valueOf(k);
        
        int idx = strNum.indexOf(strK);
        return idx == -1 ? -1 : idx + 1;
    }
}
