import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/2164
public class P2164_카드 {

    public static void main(String[] args) throws Exception {
        // 초기세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i=1; i<=N; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());
    }
}
