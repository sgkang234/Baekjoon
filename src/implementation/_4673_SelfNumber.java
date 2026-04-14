package implementation;

// 26.04.13
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
        // 입력
        int max = 10000;
        Boolean[] arr = new Boolean[max+1];
        Arrays.fill(arr, true);
        arr[0] = false;
        int num = 1;
        int sum = 1;
        int count = 1;

        // 로직
        while (count != 10000){
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if(sum > 10000){
                count++;
                num = count;
                sum = count;
            } else {
                arr[sum] = false;
                num = sum;
            }
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= max ; i++) {
            if(arr[i]){
                sb.append(i)
                        .append("\n");
            }
        }
        System.out.println(sb);
    }
}
