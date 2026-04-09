package math;

// 26.04.09
// 백준 1934
// 두 수의 최소공배수(LCM)를 구하는 프로그램

/*
[입력]
3
1 45000
6 10
13 17

[출력]
45000
30
221
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1934_LeastCommonMultiple {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 로직
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int lcm = (a*b/gcd(a, b));
            sb.append(lcm)
                    .append("\n");
        }

        // 출력
        System.out.println(sb);
    }
    // 최대 공약수 구하는 메서드
    static int gcd(int a, int b){
        while (b != 0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
}