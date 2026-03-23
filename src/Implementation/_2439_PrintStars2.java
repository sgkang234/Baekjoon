package Implementation;

// 2026.03.22
// 백준 2439
// 백준 2439와 반대로 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 프로그램

import java.util.Scanner;

public class _2439_PrintStars2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = num; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            for (int j = num-i+1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
