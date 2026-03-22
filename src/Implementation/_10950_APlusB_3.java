package Implementation;

// 26.03.19
// 백준 10950
// 각 값을 더하는 프로그램

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _10950_APlusB_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // 한 줄을 통째로 읽고

            int A = Integer.parseInt(st.nextToken()); // 띄어쓰기마다 숫자로 형변환
            int B = Integer.parseInt(st.nextToken());
            System.out.println(A + B);
        }
    }
}