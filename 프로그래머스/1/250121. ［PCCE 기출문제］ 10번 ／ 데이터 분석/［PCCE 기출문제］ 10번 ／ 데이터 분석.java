import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        int ext_idx = ext.equals("code") ? 0 : ext.equals("date") ? 1 : ext.equals("maximum") ? 2: 3;
        int sort_by_idx = sort_by.equals("code") ? 0 : sort_by.equals("date") ? 1 : sort_by.equals("maximum") ? 2: 3;
        
        for (int[] d : data) {
            if (val_ext > d[ext_idx]) {
                list.add(d);
            }
        }
        
        int[][] answer = new int[list.size()][4];
        int i = 0;
        for (int[] ele : list) {
            answer[i] = ele;
            i++;
        }
        Arrays.sort(answer, (a, b) -> a[sort_by_idx] - b[sort_by_idx]);
        
        return answer;
    }
}