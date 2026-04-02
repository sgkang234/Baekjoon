package math;

// 26.03.31
// 백준 2292
// 벌집 통과 프로그램
/*
1 -> 2 ~ 7 (방 6개 )-> 8 ~19 방 (12개)-> 방이 6*k씩 증가
*/

/*
[입력]
13

[출력]
3
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2292_Beehive {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int wantRoom = Integer.parseInt(br.readLine());

        // 로직
        int wall = 1;
        int room = 1;
        while (wantRoom > room) {
            room += 6 * wall;
            wall++;
        }

        // 출력
        System.out.println(wall);
    }
}
