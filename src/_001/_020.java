package _001;

// 26.03.19
// 백준 2739
// N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램

import java.util.Scanner;

public class _020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <10 ; i++) {
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
