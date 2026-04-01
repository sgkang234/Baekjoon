package Math;

// 26.04.01
// 백준 9506
// 정수 N이 주어졌을 때, 소인수분해하는 프로그램

import java.util.Scanner;

public class _11653_PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = scanner.nextInt();
        int num = 2;

        while (n != 1){ // 소인수분해의 끝은 1이다.
            if(n % num == 0){
                n = n/num;
                sb.append(num)
                        .append("\n");
            }else{
                num++;
            }
        }
        System.out.println(sb);
    }
}