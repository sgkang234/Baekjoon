package implementation;

// 26.04.13
// 백준 1110
// 주어진 수를 특정 규칙으로 반복 변환하여 원래 수로 돌아오는 사이클의 길이를 구하는 프로그램

/*
[입력]
26

[출력]
4
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1110_AddCycle {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        int result = num;

        while (true){
            count++;
            int n1 = result/10;
            int n2 = result%10;
            int n3 = n1 + n2;

            result = n2*10 + n3%10;
            if(result == num){
                System.out.println(count);
                return;
            }
        }
    }
}