package bruteforce;

// 26.04.05
// 백준 1436
// 숫자에 666이 포함된 수를 순서대로 찾아 N번째 수를 구하는 완전탐색 문제

/*
[입력]
3

[출력]
2666
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1436_MovieDirectorShom {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 로직 및 출력
        int count = 0;
        for (int i = 0; i <Integer.MAX_VALUE ; i++) {
            String s = String.valueOf(i);
            if(s.contains("666")){
                count++;
            }
            if(count == n){
                System.out.println(i);
                return;
            }
        }
    }
}
