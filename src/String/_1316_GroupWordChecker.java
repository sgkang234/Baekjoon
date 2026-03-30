package String;

// 26.03.29
// 백준 1316
// 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램

import java.util.Scanner;

public class _1316_GroupWordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            sum += isGroup(s);
        }
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

