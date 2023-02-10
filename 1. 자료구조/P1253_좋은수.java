import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/1253
public class P1253_좋은수 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] arr = new long[N];
        for (int i=0; i<N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        int answer = 0;
        for (int i=0; i<N; i++) {
            long find = arr[i];
            int start = 0;
            int end = N-1;
            while (start < end) {
                long sum = arr[start] + arr[end];
                if (sum == find) {
                    if (start!=i && end!=i) {
                        answer++;
                        break;
                    } else if (start == i) {
                        start++;
                    } else if (end == i) {
                        end--;
                    }
                } else if (sum > find) {
                    end--;
                } else { // sum < find
                    start++;
                }
            }
        }

        System.out.println(answer);
    }
}
