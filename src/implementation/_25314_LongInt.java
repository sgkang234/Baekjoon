package implementation;

// 2026.03.20
// 백준 25314
// N / 4 만큼 "long " 반복, 마지막에 "int" 출력

/*
[입력]
4

[출력]
long int
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _25314_LongInt {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // 로직
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num / 4; i++) {
            sb.append("long ");
        }
        sb.append("int");

        // 출력
        System.out.println(sb);
    }
}