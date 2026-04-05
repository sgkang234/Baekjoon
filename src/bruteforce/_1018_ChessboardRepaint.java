package bruteforce;

// 26.04.05
// 백준 1018
// 8×8 체스판으로 만들기 위해 최소로 다시 칠해야 하는 칸 수를 구하는 완전탐색 프로그램

/*
[입력]
8 8
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBBBWBW
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBWBWBW

[출력]
1
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1018_ChessboardRepaint {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 로직
        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int countW = 0; // W로 시작
                int countB = 0; // B로 시작

                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        // 현재 위치
                        char current = board[i + x][j + y];
                        // (짝수 합 → 시작색)
                        if ((x + y) % 2 == 0) {
                            if (current != 'W') countW++;
                            if (current != 'B') countB++;
                        } else {
                            if (current != 'B') countW++;
                            if (current != 'W') countB++;
                        }
                    }
                }
                min = Math.min(min, Math.min(countW, countB));
            }
        }
        // 출력
        System.out.println(min);
    }
}
