package strings;

// 26.03.29
// 백준 2941
// 크로아티아 알파벳 해당 문제는 백준에 가서 직접 보는 것을 추천

/*
[입력]
ljes=njak

[출력]
6
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2941_CroatianAlphabet {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // 로직
        String[] cro = {
                "c=", "c-", "dz=", "d-",
                "lj", "nj", "s=", "z="
        };

        for (int i = 0; i < cro.length; i++) {
            s = s.replace(cro[i], "*"); // 하나의 문자로 치환
        }

        // 출력
        System.out.println(s.length());
    }
}
