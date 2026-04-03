package time_complexity;

// 26.04.03
// 백준 24264
// 이중 반복문 구조에서 실행 횟수(n²)와 시간복잡도 (O(n²))를 출력하는 문제
/*
MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        for j <- 1 to n
            sum <- sum + A[i] × A[j]; # 코드1
    return sum;
}
반복문이 n²번 반복되므로 연산 횟수는 n^2에 따라 비례한다.
따라서 시간 복잡도는 O(n²)이다.
*/

/*
[입력]
7

[출력]
49
2
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24264_AlgorithmClass3 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());

        // 출력
        System.out.println(n*n);
        System.out.println(2);
    }
}
