package 복습_다시풀기;

import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/11286
public class P11286_절댓값힙 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pQ = new PriorityQueue<>((o1, o2) -> {
            int a = Math.abs(o1);
            int b = Math.abs(o2);
            if (a!=b) {
                return a-b;
            } else {
                return o1 - o2;
            }
        });

        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (pQ.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pQ.poll());
                }
            } else {
                pQ.offer(num);
            }
        }

    }
}
