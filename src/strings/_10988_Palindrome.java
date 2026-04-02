package strings;

// 26.03.29
// 백준 10988
// 팰린드롬인지 아닌지 확인하는 프로그램

/*
[입력]
level

[출력]
1
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10988_Palindrome {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        // 로직
        // 양쪽에서부터 같은 단어인지 확인하는 반복문
        for (int i = 0; i <s.length()/2; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(s.length() -i -1); // 문자열의 길이를 생각해 -1
            if(c1 != c2){
                System.out.println(0);
                System.exit(0); // 만약 같지 않다면 즉시 종료한다.
            }
        }

        // 출력
        System.out.println(1);
    }
}
