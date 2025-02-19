class Solution {
    char[] charArr = {'A', 'E', 'I', 'O', 'U'};
    String goal = "";
    int answer = 0;
    int cnt = 0;
    
    public int solution(String input) {
        goal = input;
        search("");
        
        return answer;
    }
    
    public void search(String word){
        if (word.equals(goal)) {
            answer = cnt;
            return;
        } else if(word.length() == 5) {
            return;
        }
        
        for (char c : charArr) {
            cnt += 1;
            search(word + c);
        }
        
    }
}