package _001;

// 26.03.18
// 백준 2753
// 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램

import java.util.Scanner;

public class _015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if(year%4 == 0 && year%100 != 0 ){
            System.out.println(1);
        } else if (year %400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
