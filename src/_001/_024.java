package _001;

// 2026.03.20
// 백준 25314
// N / 4 만큼 "long " 반복, 마지막에 "int" 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N / 4; i++) {
            System.out.print("long ");
        }

        System.out.println("int");
    }
}