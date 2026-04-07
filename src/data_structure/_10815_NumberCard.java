package data_structure;

// 26.04.07
// 백준 10815
// 주어진 숫자가 집합에 존재하는지 탐색으로 확인하는 프로그램

/*
[입력]
5
6 3 2 10 -10
8
10 9 -5 2 3 4 5 -10

[출력]
1 0 0 1 1 0 0 1
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class _10815_NumberCard {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>(); //해쉬셋을 통해 중복으로 들어오는 단어 차단
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        // 로직
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            if (set.contains(target)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        // 출력
        System.out.println(sb);
    }
}
