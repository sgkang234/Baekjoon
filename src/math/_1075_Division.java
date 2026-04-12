package math;

// 26.04.12
// 백준 1075
// 주어진 수의 마지막 두 자리를 바꿔 특정 수로 나누어떨어지게 만드는 최소 값을 구하는 프로그램

/*
[입력]
32442
99

[출력]
72
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1075_Division {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());

        // 로직 및 출력
        n = (n / 100) * 100;

        for (int i = 0; i <100 ; i++) {
            if( (n+i)%f  == 0){
                System.out.printf("%02d\n", i);
                break;
            }
        }
    }
}
