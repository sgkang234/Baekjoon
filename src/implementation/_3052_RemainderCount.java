package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26.03.25
// 백준 3052
// 정수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한 다음 서로 다른 값이 몇 개 있는지 출력 프로그램

/*
[입력]
1
2
3
4
5
6
7
8
9
10

[출력]
10
*/

public class _3052_RemainderCount {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 로직
        boolean[] arr = new boolean[42]; // true false 배열 생성해 42의 나머지가 있다면 true 없다면 false
        int count = 0;
        for (int i = 0; i <10 ; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[a%42] = true; // 입력받은 정수를 42로 나눈 나머지를 배열에 저장
        }
        // arr 배열의 true인 것만 count++
        for (int i = 0; i <42 ; i++) {
            if(arr[i]){
                count++;
            }
        }

        // 출력
        System.out.println(count);
    }
}
