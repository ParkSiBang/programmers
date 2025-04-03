class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int n = schedules.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean isAllOnTime = true;

            for (int j = 0; j < 7; j++) {
                int dayOfWeek = (startday + j) % 7;
                
                // 주말은 스킵
                if (dayOfWeek == 0 || dayOfWeek == 6) continue;

                int hopeTime = schedules[i];
                int arrivalTime = timelogs[i][j];

                int hopeHour = hopeTime / 100;
                int hopeMin = hopeTime % 100;
                int deadlineHour = hopeHour;
                int deadlineMin = hopeMin + 10;

                // 분이 60 넘어가면 시간으로 올림
                if (deadlineMin >= 60) {
                    deadlineHour += 1;
                    deadlineMin -= 60;
                }

                int deadlineTime = deadlineHour * 100 + deadlineMin;

                if (arrivalTime > deadlineTime) {
                    isAllOnTime = false;
                    break;
                }
            }

            if (isAllOnTime) count++;
        }

        return count;
    }
}
