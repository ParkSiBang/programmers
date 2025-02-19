import java.util.*;

class Solution {
    public int solution(String dirs) {
        int x = 0, y = 0; // 시작 좌표
        Set<String> visitedPaths = new HashSet<>(); // 방문한 길 저장

        for (char dir : dirs.toCharArray()) {
            int nx = x, ny = y;

            switch (dir) {
                case 'U': ny += 1; break;
                case 'D': ny -= 1; break;
                case 'R': nx += 1; break;
                case 'L': nx -= 1; break;
            }

            if (nx >= -5 && nx <= 5 && ny >= -5 && ny <= 5) {
                String path1 = x + "," + y + "->" + nx + "," + ny;
                String path2 = nx + "," + ny + "->" + x + "," + y;

                // 방문한 길이 아니라면 추가
                if (!visitedPaths.contains(path1) && !visitedPaths.contains(path2)) {
                    visitedPaths.add(path1);
                    visitedPaths.add(path2);
                }

                x = nx;
                y = ny;
            }
        }
        return visitedPaths.size() / 2;
    }
}