package implementation;

// 26.03.24
// 백준 2562
// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램

/*
[입력]
3
29
38
12
57
74
40
85
61

[출력]
85
8
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2562_MaxValue {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine());

        // 로직
        int index = 1;
        // index가 0부터가 아닌, 1부터 시작하도록 문제를 풀어야 하기에 1 ~ 9 가 아닌 2 ~ 10
        for (int i = 2; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            if(max < num){
                max = num;
                index = i;
            }
        }

        // 출력
        System.out.println(max + "\n" + index);
    }
}
