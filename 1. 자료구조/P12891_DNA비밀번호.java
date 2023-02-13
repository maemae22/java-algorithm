import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/12891
public class P12891_DNA비밀번호 {

    // 여러 메서드에서 동일하게 사용하고 싶을 경우, 전역변수(static)로 지정
    static int[] nowCheck;
    static int checkNum;
    static int[] checkArr;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        char[] dna = br.readLine().toCharArray();

        nowCheck = new int[4]; // 현재 내꺼의 A C G T 개수
        checkNum = 0; // A C G T 중 조건에 만족한 개수, 4가 될 경우 정답임
        long answer = 0; // 정답 count

        st = new StringTokenizer(br.readLine());
        checkArr = new int[4]; // 문제에서 주어진 A C G T 최소 개수
        for (int i=0; i<4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                checkNum++;
            }
        }

        // 초기 세팅
        for (int i=0; i<P; i++) {
            Add(dna[i]);
        }
        if (checkNum == 4) {
            answer++;
        }

        // 하나씩 옆으로 밀면서 비교 (슬라이딩 윈도우)
        for (int i=P; i<S; i++) {
            Remove(dna[i-P]);
            Add(dna[i]);
            if (checkNum == 4) {
                answer++;
            }
        }

        System.out.println(answer);

    }

    private static void Add(char c) {
        if (c == 'A') {
            nowCheck[0]++;
            if (nowCheck[0] == checkArr[0]) {
                checkNum++;
            }
        } else if (c == 'C') {
            nowCheck[1]++;
            if (nowCheck[1] == checkArr[1]) {
                checkNum++;
            }
        } else if (c == 'G') {
            nowCheck[2]++;
            if (nowCheck[2] == checkArr[2]) {
                checkNum++;
            }
        } else if (c == 'T') {
            nowCheck[3]++;
            if (nowCheck[3] == checkArr[3]) {
                checkNum++;
            }
        }
    }

    private static void Remove(char c) {
        if (c == 'A') {
            if (nowCheck[0] == checkArr[0]) {
                checkNum--;
            }
            nowCheck[0]--;
        } else if (c == 'C') {
            if (nowCheck[1] == checkArr[1]) {
                checkNum--;
            }
            nowCheck[1]--;
        } else if (c == 'G') {
            if (nowCheck[2] == checkArr[2]) {
                checkNum--;
            }
            nowCheck[2]--;
        } else if (c == 'T') {
            if (nowCheck[3] == checkArr[3]) {
                checkNum--;
            }
            nowCheck[3]--;
        }
    }

}