package Math;

// 26.03.30
// 백준 11005
// 진법 전환 프로그램2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11005_BaseConversion2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int r = n % b;

            if (r < 10) {
                sb.append((char)(r + '0'));
            } else {
                sb.append((char)(r - 10 + 'A'));
            }
            n /= b;
        }
        System.out.println(sb.reverse());
    }
}
