package math;

// 26.04.02
// 백준 14215
// 세 막대로 만들 수 있는 삼각형의 최대 둘레를 구하는 프로그램

/*
[입력]
1 2 3

[출력]
5
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _14215_ThreeSticks {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());

        // 로직
        Arrays.sort(arr);
        if(arr[2] >= arr[0] + arr[1]){ // 삼각형의 가장 긴 변은 나머지 두 변의 합보다 작아야 한다.
            sb.append(arr[0] + arr[1] + arr[0] + arr[1]-1);
        } else{
            sb.append(arr[1] + arr[2] + arr[0]);
        }

        // 출력
        System.out.println(sb);
    }
}
