package sorting;

// 26.04.05
// 백준 2750
// 주어진 숫자들을 오름차순으로 정렬하는 기본 정렬 문제

/*
[입력]
5
5
2
3
4
1

[출력]
1
2
3
4
5
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2750_SortNumbers {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 로직
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            sb.append(arr[i])
                    .append("\n");
        }

        // 출력
        System.out.println(sb);
    }
}
