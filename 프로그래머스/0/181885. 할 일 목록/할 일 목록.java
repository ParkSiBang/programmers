import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> pendingTasks = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {  // 완료되지 않은 작업만 추가
                pendingTasks.add(todo_list[i]);
            }
        }

        return pendingTasks.toArray(new String[0]);  // 리스트를 배열로 변환하여 반환
    }
}

