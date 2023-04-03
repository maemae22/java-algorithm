import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/2750
public class P2750_수정렬하기 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 버블 정렬 구현
        for (int i=0; i<N-1; i++) {
            for (int j=1; j<N-i; j++) {
                if (arr[j] < arr[j-1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }

        // 출력
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
