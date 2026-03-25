package Implementation;

// 26.03.25
// 백준 5597
// 30명의 학생 중 과제를 제출하지 않은 2명의 학생 번호 출력 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5597_MissingStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[30]; // 전체 반의 인원 수

        for (int i = 0; i < 28; i++) { // 총 제출자 28명
            int n = Integer.parseInt(br.readLine());
            arr[n-1] = true;
        }

        // 안 낸 학생 출력
        for (int i = 0; i < 30; i++) {
            if (!arr[i]) {
                System.out.println(i+1);
            }
        }
    }
}
