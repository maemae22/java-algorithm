import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/11659
public class P11659_구간합구하기 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());
        long[] sumArr = new long[N+1];

        token = new StringTokenizer(br.readLine());
        for (int i=1; i<=N; i++) {
            sumArr[i] = sumArr[i-1] + Integer.parseInt(token.nextToken());
        }

        for (int k=0; k<M; k++) {
            token = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(token.nextToken());
            int end = Integer.parseInt(token.nextToken());
            System.out.println(sumArr[end]-sumArr[start-1]);
        }
    }
}
