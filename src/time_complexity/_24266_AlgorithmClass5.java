package time_complexity;

// 26.04.03
// 백준 24266
// 삼중 반복문 구조에서 실행 횟수(n³)와 시간복잡도(O(n³))를 출력하는 프로그램
/*
MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        for j <- 1 to n
            for k <- 1 to n
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
    return sum;
}
세 개의 중첩된 반복문이므로, 각 반복문이 n번씩 수행된다.
즉 안쪽 연산은 총 n × n × n = n³번 수행된다.
따라서 연산 횟수는 n³에 비례하므로 시간 복잡도는 O(n³)이다.
*/

/*
[입력]
7

[출력]
343
3
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24266_AlgorithmClass5 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        // 출력
        System.out.println(n * n * n);
        System.out.println(3);
    }
}
