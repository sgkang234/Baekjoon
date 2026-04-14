package implementation;

// 26.04.14
// 백준 4673
// 생성자가 없는 수(셀프 넘버)를 찾아 출력하는 프로그램

/*
[입력]

[출력]
1
3
5
7
9
20
--
*/

import java.util.Arrays;

public class _4673_SelfNumber {
    public static void main(String[] args) {
        int max = 10000;
        boolean[] arr = new boolean[max + 1];
        Arrays.fill(arr, true);

        for (int i = 1; i <= max; i++) {
            int sum = i;
            int num = i;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum <= max) {
                arr[sum] = false;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= max; i++) {
            if (arr[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}
