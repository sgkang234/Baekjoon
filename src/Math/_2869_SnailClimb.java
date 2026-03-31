package Math;

// 26.03.31
// 백준 2869
// 높이가 v미터인 나무를 올라가는데, 낮에 A미터를 올라가고, 밤에 B미터를 미끄러질 때 걸리는 날을 구하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2869_SnailClimb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int day = (v - a) / (a - b);

        if ((v - a) % (a - b) != 0) {
            day++;
        }

        System.out.println(day + 1);
    }
}
