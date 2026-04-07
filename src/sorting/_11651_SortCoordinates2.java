package sorting;

// 26.04.06
// 백준 11651
// 좌표를 y값 기준, 같으면 x값 기준으로 정렬하는 프로그램

/*
[입력]
5
0 4
1 2
1 -1
2 2
3 3

[출력]
1 -1
1 2
2 2
3 3
0 4
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11651_SortCoordinates2 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // x
            arr[i][1] = Integer.parseInt(st.nextToken()); // y
        }

        // 로직
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr, (a, b) ->{
            if (a[1] == b[1]){
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        // 출력
        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0]).append(" ")
                    .append(arr[i][1])
                    .append("\n");
        }
        System.out.print(sb);
    }
}