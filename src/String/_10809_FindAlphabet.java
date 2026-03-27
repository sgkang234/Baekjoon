package String;

// 26.03.27
// 백준 10809
// 알파벳 소문자로만 이루어진 단어 S가 주어질 때, 각 알파벳에 대해 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10809_FindAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();

        // 알파벳 배열
        int[] arr = new int[26];

        // 모든 배열 -1 초기화
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        //  char 데이터 타입을 형변환을 통해 숫자로 형변환 이를 통해 a는 0
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (arr[index] == -1) { // 처음 등장하는 영단어만
                arr[index] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
