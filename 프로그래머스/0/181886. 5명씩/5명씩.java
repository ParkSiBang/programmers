import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] names) {
        List<String> leaders = new ArrayList<>();
        
        for (int i = 0; i < names.length; i += 5) {
            leaders.add(names[i]);  // 각 그룹의 첫 번째 사람 추가
        }
        
        return leaders.toArray(new String[0]);  // 리스트를 배열로 변환하여 반환
    }
}
