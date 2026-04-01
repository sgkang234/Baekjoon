package implementation;

// 2026.03.22
// 백준 2438
// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 프로그램

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

public class _2438_PrintStars1 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // 로직
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <=i ; j++) {
                sb.append("*");

            }
            sb.append("\n");
        }

        // 출력
        System.out.println(sb);
    }
}
