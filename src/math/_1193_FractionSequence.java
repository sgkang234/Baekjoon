package math;

// 26.03.31
// 백준 1193
// 분수 찾기 프로그램

/*
[입력]
2

[출력]
1/2
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1193_FractionSequence {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //로직
        int line = 1;  // 몇 번째 줄인지
        int sum = 0;   // 이전 줄까지의 개수 합
        // 몇 번째 줄인지 찾기
        while (sum + line < n) {
            sum += line;
            line++;
        }
        // 해당 줄에서 몇 번째인지
        int pos = n - sum;

        // 출력
        // 방향에 따라 분자/분모 결정
        if (line % 2 == 0) {
            // 짝수 줄 → 아래 방향
            System.out.println(pos + "/" + (line - pos + 1));
        } else {
            // 홀수 줄 → 위 방향
            System.out.println((line - pos + 1) + "/" + pos);
        }
    }
}
