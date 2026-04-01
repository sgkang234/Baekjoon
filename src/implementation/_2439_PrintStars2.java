package implementation;

// 2026.03.22
// 백준 2439
// 백준 2439와 반대로 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 프로그램

/*
[입력]
4

[출력]
*
**
***
****
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2439_PrintStars2 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // 로직
        StringBuilder sb = new StringBuilder();
        for (int i = num; i > 0; i--) {
            // 공백
            for (int j = 0; j < i - 1; j++) {
                sb.append(' ');
            }
            // 별
            for (int j = num - i + 1; j > 0; j--) {
                sb.append('*');
            }
            sb.append('\n');
        }

        // 출력
        System.out.println(sb);
    }
}
