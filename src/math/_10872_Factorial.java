package math;

// 26.04.02
// 백준 10101
// 주어진 수의 팩토리얼 값을 구하는 프로그램

/*
[입력]
10

[출력]
3628800
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10872_Factorial {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long result = 1;

        // 로직
        for (int i = n; i >0 ; i--) {
            result*=i;
        }

        // 출력
        System.out.println(result);
    }
}
