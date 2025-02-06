class Solution {
    public int[] solution(int[] array) {
        int maxVal = array[0];
        int maxIndex = 0;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxVal) {
                maxVal = array[i];
                maxIndex = i;
            }
        }
        
        return new int[]{maxVal, maxIndex};
    }
}
