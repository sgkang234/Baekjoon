package math;

// 26.04.10
// 백준 13909
// 열고 닫기를 반복한 뒤 열린 창문의 개수를 제곱수의 개수로 구하는 프로그램

/*
[입력]
3

[출력]
1
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _13909_Window {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        // 출력
        System.out.println((long)Math.sqrt(n));
    }
}
