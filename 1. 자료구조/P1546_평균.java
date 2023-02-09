import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/1546
public class P1546_평균 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long total = 0;
        long max = 0;
        long T = Integer.parseInt(br.readLine());
        StringTokenizer token = new StringTokenizer(br.readLine());
        while (token.hasMoreTokens()) {
            int num = Integer.parseInt(token.nextToken());
            total += num;
            if (max < num) {
                max = num;
            }
        }
        System.out.println((double) total/max*100/T);
    }
}
