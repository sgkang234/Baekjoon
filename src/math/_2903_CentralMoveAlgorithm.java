package math;

// 26.03.31
// 백준 2903
// 중앙 이동 알고리즘 프로그램
/*
9 -> 25 -> 81 -> 17*17
3 5 9 17
3 -> 5 = (3 * 2 -1) -> 9 = (5 * 2 - 1)
*/

/*
[입력]
2

[출력]
25
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2903_CentralMoveAlgorithm {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int dot = Integer.parseInt(br.readLine());

        // 로직
        int re = 3;
        for (int i = 1; i < dot; i++) {
            re = (re*2) - 1;
        }

        // 출력
        System.out.println(re*re);
    }
}
