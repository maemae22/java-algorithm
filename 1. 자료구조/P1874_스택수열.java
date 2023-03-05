import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/1874
public class P1874_스택수열 {

    public static void main(String[] args) throws Exception {
        // 초기세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = 1;
        int NO = 0;

        Stack<Integer> stack = new Stack<>();

        // 로직
        for (int i=0; i<N; i++) {
            int now = arr[i];

            if (num <= now) {
                while (num <= now) {
                    bw.write("+\n");
                    stack.push(num);
                    num++;
                }
                bw.write("-\n");
                stack.pop();
            } else if (num > now) {
                int n = stack.pop();

                if (n > now) {
                    System.out.println("NO");
                    NO = 1;
                    break;
                } else {
                    bw.write("-\n");
                }
            }
        }

        if (NO == 0) {
            bw.flush();
        }
        bw.close();
    }
}
