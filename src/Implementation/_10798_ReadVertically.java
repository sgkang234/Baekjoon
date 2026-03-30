package Implementation;

// 26.03.30
// 백준 10798
// 5번의 문자열을 입력하고 입력한 문자열을 세로로 출력하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10798_ReadVertically {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] arr = new String[5];
        int max = 0;

        // 사용자에게 입력 받는 반복문
        for (int i = 0; i <5 ; i++) {
            arr[i] = br.readLine();
            if(max < arr[i].length()){
                max = arr[i].length();
            }
        }

        for (int i = 0; i < max ; i++) {
            for (int j = 0; j <5 ; j++) {
                if (i < arr[j].length()) { // 배열의 범위가 벗어나지 않도록
                    sb.append(arr[j].charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
}
