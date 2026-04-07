package sorting;

// 26.04.06
// 백준 2751
// 많은 수를 빠르게 정렬해야 하는 프로그램 (시간 제한 때문에 효율적인 정렬 필요)

/*
[입력]
5
5
4
3
2
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

public class _2751_SortNumbers2 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 로직
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            sb.append(arr[i])
                    .append("\n");
        }

        // 출력
        System.out.print(sb);
    }
}