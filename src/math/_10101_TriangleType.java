package math;

// 26.04.02
// 백준 10101
// 세 각의 크기를 보고 삼각형 종류를 판별하는 프로그램

/*
[입력]
60
70
50

[출력]
Scalene
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10101_TriangleType {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        //로직
        // 1. 삼각형 조건 확인
        if (a + b + c != 180) {
            sb.append("Error");
        }
        // 2. 정삼각형
        else if (a == b && b == c) {
            sb.append("Equilateral");
        }
        // 3. 이등변삼각형
        else if (a == b || b == c || a == c) {
            sb.append("Isosceles");
        }
        // 4. 일반삼각형
        else {
            sb.append("Scalene");
        }

        // 출력
        System.out.println(sb);
    }
}
