package Math;


// 26.04.01
// 백준 2581
// 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2581_PrimeRange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = Integer.MAX_VALUE ;
        for (int i = first; i <= second ; i++) {
            if (i == 1) continue;
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if( i%j == 0 ){ // 소수가 아니라면
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sum += i;
                if(min > i){
                    min = i;
                }
            }
        }
        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
