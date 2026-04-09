package math;

// 26.04.09
// 백준 1934
// 큰 수에 대해 최대공약수(GCD)를 이용해 최소공배수를 구하는 프로그램

/*
[입력]
1 123

[출력]
123
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _13241_LeastCommonMultiple2 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        // 로직
        long lcm = a*b / gcd(a, b);

        // 출력
        System.out.println(lcm);
    }
    static long gcd(long a, long b){
        while (b!=0){
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
