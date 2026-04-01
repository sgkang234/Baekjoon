package implementation;

// 26.03.18
// 백준 2884
// 두 정수 H와 M이 입력된 후 해당 시간에 45분 전을 출력하는 프로그램

/*
[입력]
10 10

[출력]
9 25
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2884_AlarmClock {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 로직
        int time = ( (h * 60) + m - 45) %(24 * 60);
        if (time< 0){
            time += (24 * 60);
        }
        h = time /60;
        m = time %60;

        // 출력
        System.out.println(h + " " + m);
    }
}
