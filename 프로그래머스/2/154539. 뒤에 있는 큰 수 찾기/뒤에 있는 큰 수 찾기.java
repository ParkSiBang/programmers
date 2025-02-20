import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        LinkedList<Integer> list = new LinkedList<>();
        Stack<Integer> stack = new Stack();

        for (int i = numbers.length - 1; i >= 0 ; i--) {
            int num = numbers[i];
            
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }
            
            if (stack.isEmpty()) {
                list.addFirst(-1);
            } else {
                list.addFirst(stack.peek());
            }
            stack.push(num);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}