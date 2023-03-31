package 복습_다시풀기;

import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/11003
public class P11003_최솟값찾기 {

    public static void main(String[] args) throws Exception {
        // 초기 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 로직
        StringBuilder sb = new StringBuilder();
        Deque<Node> deque = new LinkedList<>();
        for (int i=0; i<N; i++) {
            int value = arr[i];
            while (!deque.isEmpty() && deque.getLast().value > value) {
                deque.removeLast();
            }
            deque.addLast(new Node(i, value));
            while (!deque.isEmpty() && i-deque.getFirst().index>=M) {
                deque.removeFirst();
            }
            sb.append(deque.getFirst().value+" ");
        }

        // 출력
        System.out.println(sb.toString());
    }
}

class Node {
    int index;
    int value;

    Node(int index, int value) {
        this.index = index;
        this.value = value;
    }
}
