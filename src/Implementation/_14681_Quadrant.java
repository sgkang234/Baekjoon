package Implementation;

// 26.03.18
// 백준 14681
// 사분면 ++ , -+, --, +- 확인해주는 프로그램

import java.util.Scanner;

public class _14681_Quadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0 && y > 0){
            System.out.println(1);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else{
            System.out.println(4);
        }
    }
}
