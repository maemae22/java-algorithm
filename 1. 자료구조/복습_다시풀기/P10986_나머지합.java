package 복습_다시풀기;

import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/10986
public class P10986_나머지합 {

    public static void main(String[] args) throws Exception {
        // 초기 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=N; i++) {
            arr[i] = (int) (Long.parseLong(st.nextToken())%M);
        }

        int[] sum = new int[N+1]; // sum[i] = 0(1) ~ i 번째까지 더한 합을 M으로 나눈 나머지
        long[] rest = new long[M]; // rest[i] = sum[] 배열에서 값(=나머지)이 i인 것의 개수
        for (int i=1; i<=N; i++) {
            sum[i] = (sum[i-1]+arr[i])%M;
            rest[sum[i]]++;
        }

        long count = 0;
        count += rest[0];
        for (int i=0; i<M; i++) {
            if (rest[i] >= 2) {
                count += rest[i] * (rest[i]-1) / 2;
            }
        }

        System.out.println(count);
    }
}
