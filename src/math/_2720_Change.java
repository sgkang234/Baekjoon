package math;

// 26.03.31
// 백준 2720
// 거스름돈을 쿼터(25), 다임(10), 니켈(5), 페니(1)로 최소 개수 계산하는 프로그램

/*
[입력]
3
124
25
194

[출력]
4 2 0 4
1 0 0 0
7 1 1 4
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2720_Change {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine()); // 반복문 반복 횟수

        // 로직
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < testCase; i++) {
            int money = Integer.parseInt(br.readLine());
            sb.append(money/25).append(" ");
            money %= 25;
            sb.append(money/10).append(" ");
            money %= 10;
            sb.append(money/5).append(" ");
            money %= 5;
            sb.append(money).append("\n");
        }

        // 출력
        System.out.println(sb);
    }
}