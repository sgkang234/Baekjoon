package data_structure;

// 26.04.08
// 백준 7785
// 출입 기록을 관리하여 현재 회사에 있는 사람들을 출력하는 프로그램

/*
[입력]
4
Baha enter
Askar enter
Baha leave
Artem enter

[출력]
Askar
Artem
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _7785_CompanyPeople {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new TreeSet<>(Collections.reverseOrder());

        // 로직
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String action = st.nextToken();

            if(action.equals("enter")){
                set.add(name);
            } else{
                set.remove(name);
            }
        }

        for (String name : set) {
            System.out.println(name);
        }
    }
}
