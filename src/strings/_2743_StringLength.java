package strings;

// 26.03.26
// 백준 2743
// 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램

/*
[입력]
pulljima

[출력]
8
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2743_StringLength {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // 출력
        System.out.println(s.length()); // 문자열의 길이를 반환하는 메서드
    }
}
