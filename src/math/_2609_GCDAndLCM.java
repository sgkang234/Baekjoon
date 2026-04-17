package math;

// 26.04.17
// 백준 2609
// 두 수의 최대공약수(GCD)와 최소공배수(LCM)를 구하는 프로그램

/*
[입력]
24 18

[출력]
6
72
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2609_GCDAndLCM {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 로직
        int gcd = gcd(a, b);
        int lcm = a*b / gcd;

        // 출력
        System.out.println(gcd + "\n" + lcm);
    }
    static int gcd(int a, int b){
        while (b!=0){
            int temp = a%b;
            a = b ;
            b = temp;
        }
        return a;
    }
}
