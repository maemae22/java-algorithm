import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/11004
public class P11004_K번째수2 {

    static int target;

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
        target = K-1;
        quickSort(arr, 0, arr.length-1);

        // 출력
        System.out.println(arr[target]);
    }

    // 퀵 정렬로 전체 배열을 정렬하지 않고, target의 값에 따라 필요한 범위만 정렬함.
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            if (pivot == target) { // pivot == target일 경우, 더이상 구할 필요 없음 (따라서 정렬을 멈추고 정답을 출력함)
                return;
            } else if (pivot < target) { // pivot < target일 경우, 오른쪽 그룹만 정렬 수행하기
                quickSort(arr, pivot+1, end);
            } else { // pivot > target일 경우, 왼쪽 그룹만 정렬 수행하기
                quickSort(arr, start, pivot-1);
            }
        }
    }

    // 배열의 파티션을 나누는 함수 - 나눈 파티션 오른쪽 부분의 첫번째 값(index)을 반환
    public static int partition(int[] arr, int start, int end) {
        if (start+1 == end) {
            if (arr[start] > arr[end]) {
                swap(arr, start, end);
            }
            return end;
        }

        int mid = (start+end) / 2;
        swap(arr, start, mid);
        int pivot = arr[start];
        int lt = start+1;
        int rt = end;

        while (lt <= rt) {
            while (arr[lt]<pivot && lt<arr.length-1) { // pivot보다 큰 수가 나올 때까지 lt++;
                lt++;
            }
            while (pivot<arr[rt] && 0<rt) { // pivot보다 작은 수가 나올 때까지 rt--;
                rt--;
            }

            if (lt<=rt) {
                swap(arr, lt, rt);
                lt++;
                rt--;
            }
        }

        // lt == rt 피벗의 값을 양쪽으로 분리한 중앙에 오도록 설정하기
        arr[start] = arr[rt];
        arr[rt] = pivot;
        return rt;
    }

    private static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

}
