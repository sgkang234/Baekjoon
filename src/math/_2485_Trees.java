package math;

// 26.04.10
// 백준 2485
// 가로수 간격의 최대공약수를 이용해 추가로 심어야 할 나무의 개수를 구하는 프로그램

/*
[입력]
4
1
3
7
13

[출력]
3
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2485_Trees {
    public static void main(String[] args) throws IOException {
        // 입략
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        //로직
        // 간격 배열
        int[] diff = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            diff[i] = arr[i + 1] - arr[i];
        }
        // GCD 구하기
        int g = diff[0];
        for (int i = 1; i < diff.length; i++) {
            g = gcd(g, diff[i]);
        }

        // 필요한 나무 개수 계산
        int result = 0;
        for (int d : diff) {
            result += (d / g) - 1;
        }

        // 출력
        System.out.println(result);
    }
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
