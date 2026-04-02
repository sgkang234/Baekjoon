package math;

// 26.04.01
// 백준 9506
// n이 완전수인지 아닌지 판단하는 프로그램

/*
[입력]
6
12
28
-1

[출력]
6 = 1 + 2 + 3
12 is NOT perfect.
28 = 1 + 2 + 4 + 7 + 14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9506_PerfectNumber {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 로직
        while (true) {
            int num = Integer.parseInt(br.readLine());
            int sum = 0;
            StringBuilder s = new StringBuilder();

            // -1일 경우 프로그램 종료
            if (num == -1){
                break;
            }

            // 어떤 값이 약수인지 확인하는 프로그램
            for (int i = 1; i < num; i++) {

                if(num % i == 0){
                    sum += i;
                    s.append(i).append(" + ");
                }
            }
            if (sum == num){
                s.setLength(s.length() - 3);
                sb.append(num)
                        .append(" = ")
                        .append(s)
                        .append("\n");
            } else {
                sb.append(num)
                        .append(" is NOT perfect.")
                        .append("\n");
            }
        }

        // 출력
        System.out.print(sb);
    }
}
