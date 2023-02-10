import java.util.*;
import java.io.*;


// https://www.acmicpc.net/problem/11660
public class P11660_구간합구하기2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N+1][N+1];
        for (int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        long[][] sum = new long[N+1][N+1];
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=N; j++) {
                sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + arr[i][j];
            }
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            System.out.println(sum[x2][y2] - sum[x1-1][y2] - sum[x2][y1-1] + sum[x1-1][y1-1]);
        }
    }

    // 시간초과
    public static void timeOut(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());
        long[][] sum = new long[N+1][N+1];

        for(int i=1; i<=N; i++) {
            token = new StringTokenizer(br.readLine());
            for (int k=1; k<=N; k++) {
                sum[i][k] = sum[i][k-1] + Integer.parseInt(token.nextToken());
            }
        }

//        System.out.println(Arrays.deepToString(sum));

        for(int i=0; i<M; i++) {
            token = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(token.nextToken());
            int y1 = Integer.parseInt(token.nextToken());
            int x2 = Integer.parseInt(token.nextToken());
            int y2 = Integer.parseInt(token.nextToken());
            int answer = 0;
            for(int k=x1; k<=x2; k++) {
                answer += (sum[k][y2]-sum[k][y1-1]);
//                System.out.println(k+"연산 시" + answer);
            }
            System.out.println(answer);
        }
    }

}
