package data_structure;

// 26.04.08
// 백준 11478
// 문자열의 서로 다른 부분 문자열의 개수를 구하는 프로그램

/*
[입력]
ababc

[출력]
12
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _11478_DifferentSubstring {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Set<String> set = new HashSet<>(); // hashset을 통해 같은 문자열의 입력을 방지

        // 모든 부분 문자열 생성
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                set.add(s.substring(i, j));
            }
        }

        // 출력
        System.out.println(set.size());
    }
}
