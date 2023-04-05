import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/2751
public class P2751_수정렬하기2 {

    public static void main(String[] args) throws Exception {
        // 초기 세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 병합 정렬로 오름차순 정렬 구현
        int[] tmp = new int[arr.length];
        mergeSort(arr, tmp, 0, arr.length-1);

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void mergeSort(int[] arr, int[] tmp, int start, int end) {
        if (start < end) {
            int mid = (start+end) / 2;
            mergeSort(arr, tmp, start, mid);
            mergeSort(arr, tmp, mid+1, end);
            merge(arr, tmp, start, mid, end);
        }
    }

    public static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
        for (int i=start; i<=end; i++) {
            tmp[i] = arr[i];
        }

        int part1 = start; // 왼쪽 그룹의 포인터
        int part2 = mid+1; // 오른쪽 그룹의 포인터
        int index = start; // 결과 배열의 포인터

        while (part1<=mid && part2<=end) {
            if (tmp[part1] <= tmp[part2]) {
                arr[index] = tmp[part1];
                part1++;
            } else {
                arr[index] = tmp[part2];
                part2++;
            }
            index++;
        }

        // 앞쪽 그룹의 데이터가 남았을 경우, 남은 데이터를 복사해서 배열의 끝에 붙여넣음.
        // (뒤쪽 데이터가 남았을 경우에는 복사할 필요 없음. 뒷쪽 데이터는 애초에 뒤쪽에 그대로 있기 때문.)
        for (int i=0; i<=mid-part1; i++) {
            arr[index+i] = tmp[part1+i];
        }
    }

}
