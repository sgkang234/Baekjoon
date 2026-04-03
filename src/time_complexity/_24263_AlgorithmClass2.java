package time_complexity;

// 26.04.03
// 백준 24263
// 입력 크기 n에 따라 실행 횟수(n)와 시간복잡도(O(n))를 출력하는 프로그램
/*
MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        sum <- sum + A[i]; # 코드1
    return sum;
}
반복문이 n번 반복되므로 연산 횟수는 n에 따라 비례한다.
따라서 시간 복잡도는 O(n)이다.
*/

/*
[입력]
7

[출력]
7
0
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24263_AlgorithmClass2 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 출력
        System.out.println(n);
        System.out.println(1);
    }
}
