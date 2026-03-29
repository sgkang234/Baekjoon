package Implementation;

// 26.03.29
// 백준 2444
// 별 만들기

import java.util.Scanner;

public class _2444_PrintStars7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int star = scanner.nextInt();

        for (int i = 0; i < star ; i++) {
            for (int j = 0; j < star-(i+1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 +1  ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < star-1 ; i++) {
            for (int j = 0; j < (i+1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((star*2)-1) - (i*2 +2) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
