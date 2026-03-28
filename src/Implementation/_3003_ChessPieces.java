package Implementation;

// 26.03.28
// 백준 3003
/*
체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
사용자가 랜덤한 체스의 양을 입력했을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3003_ChessPieces {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 체스의 구성
        int[] pieces = {1, 1, 2, 2, 2, 8};

        // 사용자의 체스 구성 입력 및 필요 및 불필요한 체스의 수 저장
        for (int i = 0; i < pieces.length; i++) {
            int piece = Integer.parseInt(st.nextToken());
            sb.append(pieces[i] - piece)
                    .append(" ");
        }
        System.out.println(sb);
    }
}
