package _001;

// 26.03.16
// 백준 11382
// A+B+C를 출력 (1 ≤ A, B, C ≤ 10^12)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);
        long c = Long.parseLong(input[2]);
        System.out.println(a+b+c);
    }
}
