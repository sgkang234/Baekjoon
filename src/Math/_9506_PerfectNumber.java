package Math;

// 26.04.01
// 백준 9506
// n이 완전수인지 아닌지 판단해주는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9506_PerfectNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
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
        System.out.print(sb);
    }
}
