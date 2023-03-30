package 복습_다시풀기;

import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/1940
public class P1940_주몽 {

    public static void main(String[] args) throws Exception {
        // 초기 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 로직
        Arrays.sort(arr);
        int lt = 0;
        int rt = arr.length-1;
        int count = 0;
        while (lt < rt) {
            int sum = arr[lt] + arr[rt];
            if (sum > M) {
                rt--;
            } else if (sum < M) {
                lt++;
            } else { // sum == M
                count++;
                lt++;
                rt--;
            }
        }

        // 출력
        System.out.println(count);
    }
}
