import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/11399
public class P11399_ATM {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 삽입 정렬로 오름차순 정렬
        for (int i=1; i<N; i++) {
            int add = arr[i];
            int addIndex = -1;
            for (int j=i-1; j>=0; j--) {
                if (arr[j] <= add) { // add가 삽입되어야 할 index = j+1
                    addIndex = j+1;
                    break;
                } else if (j==0 && arr[0] > add) {
                    addIndex = 0;
                }
            }

            for (int k=i-1; k>=addIndex; k--) { // addIndex부터 i-1까지 뒤로 한칸씩 밀기
                arr[k+1] = arr[k];
            }
            arr[addIndex] = add;
        }

        // 출력
        int answer = 0;
        for (int i=0; i<N; i++) {
            answer += arr[i]*(N-i);
        }

        System.out.println(answer);
    }
}
