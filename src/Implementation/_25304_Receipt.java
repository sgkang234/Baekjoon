package Implementation;

// 2026.03.20
// 백준 25304
// 구매한 총 액의 가격과 종류를 입력한다. 이후 구매한 물건의 값과 개수를 입력한다. 맞으면 YES, 틀리면 NO를 출력하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _25304_Receipt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int price = Integer.parseInt(input[0]);
            int count = Integer.parseInt(input[1]);
            sum += price * count;
        }
        if (sum == x) { // 프로그램으로 계산된 총액과 사용자가 입력한 총액의 값이 같다면
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
