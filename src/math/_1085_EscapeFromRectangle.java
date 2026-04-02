package math;

// 26.04.01
// 백준 1978
// (x, y)에서 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있을 때, 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램
/*
최소값은 x, y, (w-x), (h-y) 중 하나이다
 */

/*
[입력]
6 2 10 3

[출력]
1
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1085_EscapeFromRectangle {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        // 로직
        int min = Math.min(Math.min(x, y), Math.min(w - x, h - y));

        // 출력
        System.out.println(min);
    }
}
