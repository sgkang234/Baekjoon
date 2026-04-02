package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26.03.25
// 백준 10811
/*
바구니 총 N개 가 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 있다.
바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 가장 오른쪽 바구니를 N번째 바구니.
앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램.
 */

/*
[입력]
5 4
1 2
3 4
1 4
2 2

[출력]
3 4 1 2 5
*/


public class _10811_ReverseSegments {
    public static void main(String[] args) throws IOException {
        // 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //바구니 수
        int m = Integer.parseInt(st.nextToken()); // 교체할 바구니 수

        // 로직
        int[] arr= new int[n];
        // 바구니의 번호 순서대로 넣는 반복문
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;

            // 구간 역순 만들기
            while (a < b) {
                int tmp = arr[a];
                arr[a] = arr[b];
                arr[b] = tmp;
                a++;
                b--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int x : arr) {
            sb.append(x).append(" ");
        }

        // 출력
        System.out.println(sb);
    }
}
