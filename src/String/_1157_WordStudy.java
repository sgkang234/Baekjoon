package String;

// 26.03.29
// 백준 1157
// 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력하는 프로그램

import java.util.Scanner;

public class _1157_WordStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] arr = new int[26];
        // 배열 초기화
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ch = Character.toUpperCase(ch);
            arr[ch-'A']++;
        }

        // 최대값 찾기
        int max = 0;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = (char)(i + 'A');
            } else if (arr[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
