package sorting;

// 26.04.06
// 백준 2587
// 주어진 수들의 평균과 중앙값을 구하는 프로그램

/*
[입력]
10
40
30
60
30

[출력]
34
30
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2587_RepresentativeValue2 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 로직
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
         sum += arr[i];
        }
        Arrays.sort(arr);

        // 출력
        System.out.println(sum / 5 + " \n" + arr[2]);
    }
}
