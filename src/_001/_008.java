package _001;

// 26.03.16
// 백준 18108번
// (A+B)%C는 ((A%C) + (B%C))%C, (A×B)%C는 ((A%C) × (B%C))%C 단 (2 ≤ A, B, C ≤ 10000) 이다. 이것이 같은 값인지 코드로 확인

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
    }
}
