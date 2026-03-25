package Implementation;

// 2026.03.20
// 백준 15552
// StringBuilder를 사용해 더 빠르게 처리하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15552_FastAPlusB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a+b).append('\n'); // StringBuilder를 통해 계속 입력을 쌓고 이를 한번에 출력해 빠른 처리가 가능하다
        }
        System.out.println(sb);
    }
}
