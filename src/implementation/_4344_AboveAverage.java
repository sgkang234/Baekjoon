package implementation;

// 26.04.13
// 백준 4344
// 평균을 넘는 학생의 비율을 계산해 퍼센트로 출력하는 프로그램

/*
[입력]
5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91

[출력]
40.000%
57.143%
33.333%
66.667%
55.556%
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4344_AboveAverage {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // 로직
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append(average(st))
                    .append("\n");
        }

        // 출력
        System.out.println(sb);
    }
    static String average(StringTokenizer st){
        int num = Integer.parseInt(st.nextToken());
        int sum = 0;
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }

        double average = (double)sum/num;

        double count = 0;
        for (int i = 0; i < num; i++) {
            if(arr[i] > average){
                count++;
            }
        }
        double result = count / num * 100;
        return String.format("%.3f%%", result);
    }
}
