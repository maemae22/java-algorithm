package 복습_다시풀기;

import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/1546
public class P1546_평균 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = 0;
        int total = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            int score = Integer.parseInt(st.nextToken());
            max = Math.max(max, score);
            total += score;
        }

        // ⭐ 형변환 주의하기 !!!!!!!
        double avg = (double) total/max*100/N;

        System.out.println(avg);
    }
}
