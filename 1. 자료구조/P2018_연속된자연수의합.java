import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/2018
public class P2018_연속된자연수의합 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 1;
        int start = 1;
        int end = 1;
        int sum = 1;

        while (end!=N) {
            if (sum==N) {
                count++;
                end++;
                sum += end;
            } else if (sum < N) {
                end++;
                sum += end;
            } else { // sum > N
                sum = sum - start;
                start++;
            }
        }
        System.out.println(count);
    }
}
