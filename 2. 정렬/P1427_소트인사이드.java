import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/1427
public class P1427_소트인사이드 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        int[] arr = new int[number.length()];
        for (int i=0; i<arr.length; i++) {
            arr[i] = number.charAt(i) - 48;
        }

        // 선택 정렬로 내림차순 정렬하기
        int N = arr.length;
        for (int i=0; i<N-1; i++) {
            int maxIndex = i;
            for (int j=i; j<N; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = tmp;
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num);
        }
        System.out.println(sb.toString());
    }
}
