package strings;

// 26.03.28
// 백준 5622
// 받은 그대로 출력하며, 빈 문자열이 입력됬을 경우 종료하는 프로그램

/*
[입력]
Hello
Baekjoon
Online Judge

[출력]
Hello
Baekjoon
Online Judge
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11718_PrintAsIs {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 로직
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }

        // 출력
        System.out.println(sb);
    }
}