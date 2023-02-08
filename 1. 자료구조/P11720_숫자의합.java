import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/11720

public class P11720_숫자의합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int answer = 0;

        for (int i=0; i<num.length(); i++) {
            answer += Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        System.out.println(answer);
    }
}
