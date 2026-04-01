package implementation;

// 26.03.15
// 백준 10869
// 두 자연수 A와 B가 주어질 때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램

/*
[입력]
7 3

[출력]
10
4
21
2
1
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10869_ArithmeticOperations {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 출력
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
