package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj7562 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int[][] moves = {
            {2, 1}, {1, 2}, {-1, 2}, {-2, 1},
            {-2, -1}, {-1, -2}, {1, -2}, {2, -1}
    };

    public static void main(String[] args) throws IOException {
        int numTestCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < numTestCases; i++) {
            solution();
        }
        System.out.println(sb);
    }

    private static void solution() throws IOException {
        int boardSize = Integer.parseInt(br.readLine());
        int[][] board = new int[boardSize][boardSize];

        st = new StringTokenizer(br.readLine());
        int startX = Integer.parseInt(st.nextToken());
        int startY = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int goalX = Integer.parseInt(st.nextToken());
        int goalY = Integer.parseInt(st.nextToken());

        if (startX == goalX && startY == goalY) {
            sb.append(0).append("\n");
            return;
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        board[startX][startY] = 1;

        while (!queue.isEmpty()) {
            int[] curPosition = queue.poll();
            int curX = curPosition[0];
            int curY = curPosition[1];

            for (int i = 0; i < 8; i++) {
                int nextX = curX + moves[i][0];
                int nextY = curY + moves[i][1];

                if (nextX < 0 || nextX >= boardSize || nextY < 0 || nextY >= boardSize) continue;

                if (nextX == goalX && nextY == goalY) {
                    sb.append(board[curX][curY]).append("\n");
                    return;
                }

                if (board[nextX][nextY] == 0) {
                    board[nextX][nextY] = board[curX][curY] + 1;
                    queue.add(new int[]{nextX, nextY});
                }
            }
        }
    }
}
