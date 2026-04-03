package time_complexity;

// 26.04.03
// 백준 24265
// 중첩 반복문에서 실행 횟수(n(n-1)/2)와 시간복잡도(O(n²))를 출력하는 프로그램
/*
MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n - 1
        for j <- i + 1 to n
            sum <- sum + A[i] × A[j]; # 코드1
    return sum;
}
i가 변할 때마다 j의 범위가 줄어들어 i = 1일 때 n-1, i = 2일 때 n-2 즉
안쪽 반복문의 횟수는 ( (n-1) + (n-2) + ... + 1 + 0 )이고, 등차수열을 활용하면 (n-1)/2이다.
바깥쪽 반복문의 횟수는 n이기에 전체 수행 횟수는 n(n-1)/2이다.
따라서 최고차항만 보면 시간 복잡도는 O(n²)이다.
*/

/*
[입력]
7

[출력]
21
2
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24265_AlgorithmClass4 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        // 출력
        System.out.println(n * (n - 1) / 2);
        System.out.println(2);
    }
}
