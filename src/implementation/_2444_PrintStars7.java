package implementation;

// 26.03.29
// 백준 2444
// 이중 별 만들기

/*
[입력]
5

[출력]
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2444_PrintStars7 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int star = Integer.parseInt(br.readLine());

        // 로직 및 출력
        for (int i = 0; i < star ; i++) {
            for (int j = 0; j < star-(i+1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 +1  ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < star-1 ; i++) {
            for (int j = 0; j < (i+1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((star*2)-1) - (i*2 +2) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
