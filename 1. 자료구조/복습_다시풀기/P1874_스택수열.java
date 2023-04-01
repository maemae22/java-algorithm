package 복습_다시풀기;

import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/1874
public class P1874_스택수열 {

    public static void main(String[] args) throws Exception {
        // 초기 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 로직 & 출력
        StringBuilder sb = new StringBuilder();
        int num = 1;
        boolean can = true;
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<N; i++) {
            int su = arr[i];
            if (su >= num) {
                while (su >= num) {
                    stack.push(num);
                    num++;
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else { // su < num
                int pop = stack.pop();
                if (pop==su) {
                    sb.append("-\n");
                } else {
                    System.out.println("NO");
                    can = false;
                    break;
                }
            }
        }

        if (can) {
            System.out.println(sb.toString());
        }
    }
}
