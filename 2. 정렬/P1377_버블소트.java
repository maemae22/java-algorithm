import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/1377
public class P1377_버블소트 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Node> list = new ArrayList<>();
        for (int i=0; i<N; i++) {
            list.add(new Node(i, Integer.parseInt(br.readLine())));
        }

        Collections.sort(list);
        int max = 0;
        for (int i=0; i<N; i++) {
            max = Math.max(max, list.get(i).index - i);
        }

        System.out.println(max+1);
    }
}

class Node implements Comparable<Node> {
    int index;
    int value;

    Node(int index, int value) {
        this.index = index;
        this.value = value;
    }

    @Override
    public int compareTo(Node o) {
        return this.value - o.value;
    }
}
