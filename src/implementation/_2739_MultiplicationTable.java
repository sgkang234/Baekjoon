package implementation;

// 26.03.19
// 백준 2739
// N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램

/*
[입력]
2

[출력]
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2739_MultiplicationTable {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // 로직
        StringBuilder sb= new StringBuilder();
        for (int i = 1; i < 10; i++) {
            int result = num * i;
            sb.append(num).append(" * ")
                    .append(i).append(" = ")
                    .append(result).append("\n");
        }

        // 출력
        System.out.println(sb);
    }
}
