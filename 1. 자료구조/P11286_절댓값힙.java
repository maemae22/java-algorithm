import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/11286
public class P11286_절댓값힙 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 우선순위 큐 선언. 정렬 기준을 새로 적용하기.
        // 기준 : 1. 절댓값 기준으로 정렬 / 2. 절댓값이 같으면 음수 우선 정렬
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int first = Math.abs(o1);
            int second = Math.abs(o2);

            if(first == second) {
                return o1 > o2? 1 : -1; // 절댓값이 같으면 음수 우선 정렬
            } else {
                return first - second; // 절댓값 기준으로 정렬
            }
        });

        for (int i=0; i<N; i++) {
            int now = Integer.parseInt(br.readLine());
            if (now == 0) {
                if (queue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.add(now);
            }
        }
    }
}
