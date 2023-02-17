import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/11003
public class P11003_최솟값찾기 {

    public static void main(String[] args) throws Exception {
        // 초기세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        // 출력을 그때 그때 하는 것보다 버퍼에 넣고 한 번에 출력하기 위해 BufferedWriter 사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 로직
        Deque<Node> deque = new LinkedList<>();

        for (int i=0; i<N; i++) {
            int now = Integer.parseInt(st.nextToken());

            // 새로운 값이 들어올 때마다, 정렬 대신 현재 수보다 큰 값을 덱에서 제거해 시간 복잡도를 줄임
            // 덱이 비어있지 않고, 마지막 덱의 value가 현재 수보다 클 때, 마지막 덱을 삭제함.
            while (!deque.isEmpty() && deque.getLast().value > now) {
                deque.removeLast();
            }

            deque.addLast(new Node(i, now));

            // 범위에서 벗어난 Node는 덱에서 제거
            if (i - deque.getFirst().index >= L ) {
                deque.removeFirst();
            }

            // BufferedWriter에 저장
            bw.write(deque.getFirst().value + " ");
        }

        bw.flush(); // 정답 출력
        bw.close();

    }

    static class Node {
        public int index;
        public int value;

        Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

}
