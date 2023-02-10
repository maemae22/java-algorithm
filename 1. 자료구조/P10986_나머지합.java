import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/10986
public class P10986_나머지합 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long[] sum = new long[N+1];
        for (int i=1; i<=N; i++) {
            sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
        }

        long answer = 0;
        long[] remain = new long[M];
        for (int i=1; i<=N; i++) {
//            int num = (int) sum[i]%M; => ⭐ 이렇게 할 경우 ArrayIndexOutOfBoundsException 발생함 ..
            int num = (int) (sum[i]%M);
            remain[num]++;
            if (num == 0) {
                answer++;
            }
        }

        for (int i=0; i<M; i++) {
            if (2 <= remain[i]) {
                answer += remain[i]*(remain[i]-1)/2;
            }
        }
        System.out.println(answer);
    }
}
