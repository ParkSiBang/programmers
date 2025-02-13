import java.util.*;

class Solution {
    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int N = 0, M = 0;
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        N = maps.length;
        M = maps[0].length;
        
        return BFS(maps, 0, 0);
    }
    
    public int BFS(int[][] maps, int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY, 1});
        boolean[][] visited = new boolean[N][M];
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int x = pos[0];
            int y = pos[1];
            int distance = pos[2];

            if (x == N-1 && y == M-1) {
                return distance;
            }

            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.add(new int[]{nx, ny, distance + 1});
                    visited[nx][ny] = true;
                }
            }
        }
        return -1;
        
    }
}