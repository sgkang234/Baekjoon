package String;

// 26.03.26
// 백준 27866
// 영어 문자열 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27866_CharacterAndString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i = Integer.parseInt(br.readLine());

        System.out.println(s.charAt(i-1)); // 문자열에서 특정 위치의 문자 하나를 가져오는 메서드
    }
}
