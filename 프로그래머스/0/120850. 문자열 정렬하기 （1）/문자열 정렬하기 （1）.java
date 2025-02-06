import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> numbers = new ArrayList<>();
        
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.add(c - '0');
            }
        }
        
        Collections.sort(numbers);
        return numbers.stream().mapToInt(i -> i).toArray();
    }
}
