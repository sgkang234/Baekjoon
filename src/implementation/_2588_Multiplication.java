package implementation;

// 26.03.16
// 백준 2588
// 두 개의 세 자리 수 A와 B에서 A×(B의 일의 자리), A×(B의 십의 자리), A×(B의 백의 자리), A×B를 출력하는 프로그램

/*
[입력]
472
385

[출력]
2360
3776
1416
181720
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2588_Multiplication {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = b;

        // 로직
        StringBuilder sb = new StringBuilder();
        sb.append(a * (b%10)).append("\n");
        b = b/10;
        sb.append(a * (b%10)).append("\n");
        b = b/10;
        sb.append(a*b).append("\n");
        sb.append(a*c);

        // 출력
        System.out.println(sb);
    }
}
