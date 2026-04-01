package Implementation;

// 26.04.01
// 백준 1978
// 세로 길이가 A cm, 가로 길이가 B cm 인 아래와 같은 직사각형의 넓이를 구하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27323_Rectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        // 출력
        System.out.println(a * b);
    }
}
