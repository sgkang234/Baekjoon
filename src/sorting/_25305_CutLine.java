package sorting;

// 26.04.06
// 백준 25305
// 점수를 정렬한 뒤 커트라인에 해당하는 값을 구하는 프로그램

/*
[입력]
5 2
100 76 85 93 98

[출력]
98
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _25305_CutLine {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 사람의 수
        int k = Integer.parseInt(st.nextToken()); // 상을 받는 사람의 수
        st = new StringTokenizer(br.readLine());

        // 로직
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        // 출력
        System.out.println(arr[n-k]);
    }
}
