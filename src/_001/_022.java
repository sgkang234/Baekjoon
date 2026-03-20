package _001;

// 2026.03.20
// 백준 8393
// 1부터 n까지 합을 구하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+= i;
        }
        System.out.println(sum);
    }
}
