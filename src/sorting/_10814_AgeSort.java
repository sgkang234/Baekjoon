package sorting;

// 26.04.07
// 백준 10814
// 나이를 기준으로 정렬하되, 같은 나이는 가입 순서를 유지하는 안정 정렬 프로그램

/*
[입력]
3
21 Junkyu
21 Dohyun
20 Sunyoung

[출력]
20 Sunyoung
21 Junkyu
21 Dohyun
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10814_AgeSort {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken(); // 나이
            arr[i][1] = st.nextToken(); // 이름
        }

        // 로직
        Arrays.sort(arr, (a, b) -> {
            return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
        });
        StringBuilder sb = new StringBuilder();
        for (String[] s : arr) {
            sb.append(s[0]).append(" ").append(s[1]).append("\n");
        }

        // 출력
        System.out.print(sb);
    }
}
