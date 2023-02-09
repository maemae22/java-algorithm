// import 문 잊지 말고 작성하기 !!!!!!!!!!!
import java.util.*;
import java.io.*;

//(경우에 따라 ~)
import java.lang.*;
import java.math.*;

public class 입력받기_BufferedReader {

    /*
    ex. 입력 예시
    4 // 테스트케이스 개수
    16 1 3
    2 6 9
    5 0 8
    422223324 2 4
     */

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 첫번째 줄. 보통 테스트케이스 개수 (예시에서는 4)

        for (int test_case=1; test_case<=T; test_case++) {

            StringTokenizer token = new StringTokenizer(br.readLine());
            String limit = token.nextToken();
            int first = Integer.parseInt(token.nextToken());
            int second = Integer.parseInt(token.nextToken());

            // 로직 작성

            System.out.println("test_case = " + test_case + " / limit = " + limit
                                + " / first = " + first + " / second = " + second);
        }

    }

    /*
    출력 결과
    test_case = 1 / limit = 16 / first = 1 / second = 3
    test_case = 2 / limit = 2 / first = 6 / second = 9
    test_case = 3 / limit = 5 / first = 0 / second = 8
    test_case = 4 / limit = 422223324 / first = 2 / second = 4
     */

}
