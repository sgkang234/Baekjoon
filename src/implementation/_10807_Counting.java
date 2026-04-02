package implementation;

// 26.03.23
// 백준 10807번
// 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램

/*
[입력]
11
1 4 1 2 4 2 4 2 3 4 4
2

[출력]
3
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10807_Counting {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 반복 횟수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine()); // 원하는 숫자
        
        // 로직
        int num = 0;
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (input == v){
                num++;
            }
        }
        
        // 출력
        System.out.println(num);
    }
}
