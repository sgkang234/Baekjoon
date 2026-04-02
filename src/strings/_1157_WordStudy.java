package strings;

// 26.03.29
// 백준 1157
// 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력하는 프로그램

/*
[입력]
Mississipi

[출력]
?
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1157_WordStudy {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // 로직
        int[] arr = new int[26];
        // 배열 초기화
        Arrays.fill(arr, 0);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ch = Character.toUpperCase(ch);
            arr[ch-'A']++;
        }
        // 최대값 찾기
        int max = 0;
        char result = '?';
        // 최대값 찾는 반복문
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = (char)(i + 'A');
            } else if (arr[i] == max) {
                result = '?';
            }
        }

        // 출력
        System.out.println(result);
    }
}
