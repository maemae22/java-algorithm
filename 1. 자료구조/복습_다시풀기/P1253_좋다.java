package 복습_다시풀기;

import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/1253
public class P1253_좋다 {

    public static void main(String[] args) throws Exception {
        // 초기 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 로직
        Arrays.sort(arr);
        long count = 0;
        for (int i=0; i<N; i++) {
            int target = arr[i];
            int lt = 0;
            int rt = N-1;
            while (lt < rt) {
                if (lt==i) {
                    lt++;
                    continue;
                }
                if (rt==i) {
                    rt--;
                    continue;
                }

                long sum = arr[lt] + arr[rt];
                if (sum > target) {
                    rt--;
                } else if (sum < target) {
                    lt++;
                } else { // sum == target
                    count++;
                    break;
                }
            }
        }

        // 출력
        System.out.println(count);
    }
}
