class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int cnt = 0;
        int bandage_time = bandage[0];
        int healing = bandage[1];
        int plus_healing = bandage[2];
        int max_health = health;
        int attack_time = 0;
        
        for (int time = 1; time <= attacks[attacks.length - 1][0]; time++) {
            if (time == attacks[attack_time][0]) {
                cnt = 0;
                health -= attacks[attack_time][1];
                
                if (health <= 0) {
                    return -1;
                }
                attack_time += 1;
            } else {
                cnt += 1;

                if (cnt == bandage_time) {
                    health += plus_healing;
                    cnt = 0;
                } 
                
                health += healing;
 
                if (health > max_health){
                    health = max_health;
                }
            }
        }
        
        return health;
    }
}