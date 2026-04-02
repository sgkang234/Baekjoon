package strings;

// 26.03.29
// 백준 1316
// 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램

/*
[입력]
5
ab
aa
aca
ba
bb

[출력]
4
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1316_GroupWordChecker {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        // 로직
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            sum += isGroup(s);
        }
        // 출력
        System.out.println(sum);
    }

    public static int isGroup(String s) {
        boolean[] alp = new boolean[26];
        char prev = 0;

        for (int i = 0; i < s.length(); i++) {
            char now = s.charAt(i);

            if (now != prev) {
                if (alp[now - 'a']) {
                    return 0; // 그룹 단어 아님
                }
                alp[now - 'a'] = true;
            }
            prev = now;
        }
        return 1; // 그룹 단어
    }
}

