package implementation;

// 26.03.18
// 백준 2753
// 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램
// 4로 나누어 떨어지고, 100으로도 나누어 떨어지지 않으면 혹은 400으로 나누어 떨어지면 윤년

/*
[입력]
2000

[출력]
1
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2753_LeapYear {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        // 로직 및 출력
        if(year%4 == 0 && year%100 != 0 ){
            System.out.println(1);
        } else if (year %400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}