package implementation;

// 26.04.13
// 백준 2577
// 세 수를 곱한 결과에서 각 숫자가 몇 번 등장하는지 세는 프로그램

/*
[입력]
150
266
427

[출력]
3
1
0
2
0
0
0
2
0
0
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2577_NumberCount {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int mul = a * b * c;

        // 로직
        int[] arr = new int[11];
        Arrays.fill(arr, 0);
        while (mul != 0){
            int num = mul%10;
            arr[num]++;
            mul /= 10;
        }

        // 출력
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
