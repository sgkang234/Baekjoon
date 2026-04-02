package implementation;

// 26.03.24
// 백준 10810
// 공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램

/*
[입력]
5 4
1 2 3
3 4 4
1 4 1
2 2 2

[출력]
1 2 1 1 0
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10810_PutBalls {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 로직
        int[] baskets = new int[n + 1]; // 1번부터 쓰기 위해 +1

        for (int row = 0; row < m; row++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            // 덮어쓰는 반복문
            for (int index = i; index <= j; index++) {
                baskets[index] = k;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(baskets[i]).append(" ");
        }

        // 출력
        System.out.println(sb.toString().trim());
    }
}