package 복습_다시풀기;

import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/17298
public class P17298_오큰수 {

    public static void main(String[] args) throws Exception {
        // 초기 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 로직
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[N];
        stack.push(0);

        for (int i=1; i<N; i++) {
            int num = arr[i];
            while (!stack.isEmpty() && arr[stack.peek()] < num) {
                answer[stack.pop()] = num;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int ans : answer) {
            sb.append(ans);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
