import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<Integer> answer = new ArrayList<>();

        s = s.substring(2, s.length() - 2); 
        String[] rows = s.split("},\\{");

        int[][] array = new int[rows.length][];
        
        for (int i = 0; i < rows.length; i++) {
            String[] cols = rows[i].split(",");
            array[i] = new int[cols.length];
            for (int j = 0; j < cols.length; j++) {
                array[i][j] = Integer.parseInt(cols[j]);
            }
        }
        
        Set<Integer> set = new HashSet<>();
        int len = 1;
        while (len <= array.length) {    
            for (int i = 0; i < array.length; i++) {
                if (array[i].length == len) {
                    for (int j=0; j<array[i].length; j++) {
                        if (set.add(array[i][j])) {
                            answer.add(array[i][j]);
                        }
                    }
                }
            }
            len++;
        }
            
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}