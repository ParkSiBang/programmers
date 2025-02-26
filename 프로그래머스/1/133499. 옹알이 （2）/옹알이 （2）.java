import java.util.*;

class Solution {
    String[] say = new String[]{"aya", "ye", "woo", "ma"};
    String ex_say = "";
    
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String bab : babbling) {
            int idx = 0;
            boolean isSay = true;
            ex_say = "";
            
            while(idx < bab.length()) {
                idx = check(bab, idx);
                
                if (idx == -1) {
                    isSay = false;
                    break;
                }
            }
            
            if (isSay) {
                answer += 1;
            }
        }
        
        
        return answer;
    }
    
    public int check(String bab, int idx) {
        int move = -1;
        
        for (String s : say) {
            if (bab.startsWith(s, idx) && !s.equals(ex_say)) {
                move = idx + s.length();
                ex_say = s;
                //System.out.println("ex_say: " +ex_say);
               // System.out.println("----------------");
                break;
            }
            
        }
        
        return move;
    }
    
}