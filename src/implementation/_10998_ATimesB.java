package implementation;

// 26.03.14
// 백준 10998
// 두 정수 A와 B를 입력 받은 다음, A*B를 출력하는 프로그램

/*
[입력]
2 3

[출력]
6
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10998_ATimesB {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 로직
        int times = a * b;

        // 출력
        System.out.println(times);
    }
}
