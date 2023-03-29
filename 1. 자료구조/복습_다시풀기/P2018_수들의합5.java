package 복습_다시풀기;

import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/2018
public class P2018_수들의합5 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = 0;
        int sum = 0;
        int i = 1; // 포인터의 왼쪽
        int j = 1; // 포인터의 오른쪽
        while(i<=N) {
            if (sum < N) {
                sum += j;
                j++;
            } else if (sum > N) {
                sum -= i;
                i++;
            } else { // sum == N
                answer++;
                sum -= i;
                i++;
                sum += j;
                j++;
            }
        }

        System.out.println(answer);
    }
}
