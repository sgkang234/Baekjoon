package implementation;

// 2026.03.22
// 백준 11021
// 두 정수 A, B를 입력받아 Case #x: "를 출력한 다음, A+B를 출력하는 프로그램

/*
[입력]
5
1 1
2 3
3 4
9 8
5 2

[출력]
Case #1: 2
Case #2: 5
Case #3: 7
Case #4: 17
Case #5: 7
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11021_APlusB_7 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // 로직
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append("Case #")
                    .append(i + 1)
                    .append(": ")
                    .append(a + b)
                    .append("\n");
        }

        // 출력
        System.out.println(sb);
    }
}
