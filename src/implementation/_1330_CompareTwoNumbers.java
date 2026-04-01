package implementation;

// 26.03.17
// 백준 1330
// 두 수 비교하는 프로그램

/*
[입력]
1 2

[출력]
<
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1330_CompareTwoNumbers {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 로직
        StringBuilder sb = new StringBuilder();

        if(a > b){
            sb.append(">");
        } else if (a < b) {
            sb.append("<");
        } else {
            sb.append("==");
        }

        // 출력
        System.out.println(sb);
    }
}
