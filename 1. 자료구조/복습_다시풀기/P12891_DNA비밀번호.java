package 복습_다시풀기;

import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/12891
public class P12891_DNA비밀번호 {

    public static void main(String[] args) throws Exception {
        // 초기 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[] letter = br.readLine().toCharArray(); // dna 문자열 배열
        int[] min = new int[26];
        st = new StringTokenizer(br.readLine());
        char[] dna = {'A', 'C', 'G', 'T'};
        for (int i=0; i<4; i++) {
            min[dna[i]-65] = Integer.parseInt(st.nextToken()); // A C G T 순
        }

        // 로직
        for (int i=0; i<M; i++) {
            char c = letter[i];
            min[c-65]--;
        }

        int answer = 0;

        boolean ok = true;
        for (int i=0; i<4; i++) {
            if (min[dna[i]-65] > 0) {
                ok = false;
                break;
            }
        }
        if (ok) {
            answer++;
        }

        // 출력
        int lt = 0;
        int rt = M;
        while (rt < N) {
            min[letter[lt]-65]++;
            min[letter[rt]-65]--;
            boolean can = true;
            for (int i=0; i<4; i++) {
                if (min[dna[i]-65] > 0) {
                    can = false;
                    break;
                }
            }
            if (can) {
                answer++;
            }
            lt++;
            rt++;
        }

        // 출력
        System.out.println(answer);
    }
}
