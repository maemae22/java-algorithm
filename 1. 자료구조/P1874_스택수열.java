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

        int num = 1;
        boolean can = true;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<N; i++) {
            int su = arr[i];
            if (su >= num) {
                while (su>=num) {
                    stack.push(num);
                    num++;
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int pop = stack.pop();
                if (pop > su) {
                    can = false;
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }

        if (can) {
            System.out.println(sb.toString());
        } else {
            System.out.println("NO");
        }
    }
}
