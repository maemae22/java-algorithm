package 복습_다시풀기;

import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/11720
public class P11720_숫자의합 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String letter = br.readLine();

        int answer = 0;
        for (int i=0; i<N; i++) {
            answer += letter.charAt(i) - 48;
//            answer += letter.charAt(i) - '0';
        }

        System.out.println(answer);
    }
}
