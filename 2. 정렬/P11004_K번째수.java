import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/11004
public class P11004_K번째수 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 퀵 정렬로 오름차순 정렬 구현
        int target = K-1;
        quickSort(arr, 0, arr.length-1);

        // 출력
        System.out.println(arr[target]);
    }

    public static void quickSort(int[] arr, int start, int end) {
        int part2 = partition(arr, start, end); // part2 = 나눈 파티션 오른쪽 부분의 첫번째 값
        if (start < part2-1) { // 왼쪽 파티션이 더 정렬되어야 할 때
            quickSort(arr, start, part2-1);
        }
        if (part2 < end) { // 오른쪽 파티션이 더 정렬되어야 할 때
            quickSort(arr, part2, end);
        }
    }

    public static int partition(int[] arr, int start, int end) { // 배열의 파티션을 나누는 함수
        int pivot = arr[(start+end)/2];
        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (pivot < arr[end]) {
                end--;
            }
            if (start<=end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start; // = 나눈 파티션 오른쪽 부분의 첫번째 값(index)
    }

    private static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

}
