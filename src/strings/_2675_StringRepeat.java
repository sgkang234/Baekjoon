package strings;

// 26.03.27
// 백준 2675
// 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램

/*
[입력]
2
3 ABC
5 /HTP

[출력]
AAABBBCCC
/////HHHHHTTTTTPPPPP
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2675_StringRepeat {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()); // 총 몇번을 반복할지

        // 로직
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken()); // 문자열을 반복할 횟수
            String s = st.nextToken(); // 문자열

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    sb.append(s.charAt(j));
                }
            }
            sb.append("\n");
        }

        // 출력
        System.out.println(sb);
    }
}
