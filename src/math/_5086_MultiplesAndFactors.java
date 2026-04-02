package math;

// 26.03.31
// 백준 2292
// 입력마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 0 0 이면 종료하는 출력하는 프로그램

/*
[입력]
8 16
32 4
17 5
0 0

[출력]
factor
multiple
neither
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _5086_MultiplesAndFactors {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 로직 및 출력
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0){
                System.out.println(sb);
                break;
            }
            if(b%a == 0 ){
                sb.append("factor\n");
            } else if(a%b == 0){
                sb.append("multiple\n");
            } else {
                sb.append("neither\n");
            }
        }
    }
}
