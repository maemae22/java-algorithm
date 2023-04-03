package 복습_다시풀기;

import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/2164
public class P2164_카드2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        for (int i=1; i<=N; i++) {
            q.offer(i);
        }

        while (q.size()!=1) {
            q.poll();
            q.offer(q.poll());
        }

        System.out.println(q.poll());
    }
}
