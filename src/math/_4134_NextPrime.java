package math;

// 26.04.10
// 백준 4134
// 주어진 수 이상에서 가장 작은 소수를 찾는 프로그램

/*
[입력]
3
6
20
100

[출력]
7
23
101
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4134_NextPrime {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        // 로직
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());
            while (true){
                if(isPrime(n)){
                    sb.append(n)
                            .append("\n");
                    break;
                }
                n++;
            }
        }
        System.out.println(sb);
    }
    static boolean isPrime(long num){
        if (num < 2){
            return false;
        }

        for (long i = 2; i*i <= num ; i++) {
            if(num % i == 0 ){
                return false;
            }
        }
        return true;
    }
}
