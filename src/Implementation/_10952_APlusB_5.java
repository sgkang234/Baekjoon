package Implementation;

// 26.03.23
// 백준 10952
// 정수 A, B를 입력받아 A와 B가 모두 0이 아닐 때까지 A+B를 출력하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10952_APlusB_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            }
            sb.append(a+b).append("\n");
        }
        System.out.println(sb);
    }
}
