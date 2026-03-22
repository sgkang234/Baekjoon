package Implementation;

// 26.03.16
// 백준 2588
// 두 개의 세 자리 수 A와 B에서 A×(B의 일의 자리), A×(B의 십의 자리), A×(B의 백의 자리), A×B를 출력하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2588_Multiplication {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = b;
        System.out.println(a * (b%10));
        b = b/10;
        System.out.println(a * (b%10));
        b = b/10;
        System.out.println(a * b);
        System.out.println(a *c);
    }
}
