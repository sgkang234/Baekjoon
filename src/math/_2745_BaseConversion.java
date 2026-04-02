package math;

// 26.03.30
// 백준 2745
// 진법 전환 프로그램

/*
[입력]
ZZZZZ 36

[출력]
60466175
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2745_BaseConversion {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        // 로직
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int value;

            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else {
                value = ch - 'A' + 10;
            }
            result = result * b + value;
        }

        // 출력
        System.out.println(result);
    }
}
