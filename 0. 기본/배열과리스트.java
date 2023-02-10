import java.util.ArrayList;
import java.util.Arrays;

public class 배열과리스트 {

    public static void main(String[] args) {
    /*
    -[배열]
    1. 메모리의 연속 공간에 값이 채워져 있는 형태의 자료구조
    2. 배열의 값은 인덱스를 통해 참조할 수 있음 (인덱스 : 0부터 시작)
    3. 선언한 자료형의 값만 저장할 수 있음

    - 특징
    1. 인덱스를 사용하여 값에 바로 접근할 수 있다.
    2. 새로운 값을 삽입하거나 특정 인덱스에 있는 값을 삭제하기 어렵다.
        값을 삽입하거나 삭제하려면 해당 인덱스 주변에 있는 값을 이동시키는 과정이 필요하다.
    3. 배열의 크기는 선언할 때 지정할 수 있으며, 한 번 선언하면 크기를 늘리거나 줄일 수 없다.
    4. 구조가 간단하므로 코딩 테스트에서 많이 사용한다.
     */

        String str = "12345";
        char[] charArr = str.toCharArray(); // .toCharArray() : String 을 char 배열로 바꿔줌
        int sum = charArr[0] - '0'; // char - '0' 하면 int로 바뀜  ex. '1' - '0'
        int sum2 = charArr[0] - 48; // 문자를 숫자형으로 변경하려면 -48 해주면 됨 (아스키코드에서 같은 의미의 문자와 숫자의 코드 값 차이는 48이기 때문) // '1' - 48


        // 배열 출력
        long[][] sumArr = new long[3][3];
        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.deepToString(sumArr));

        // 배열 정렬
        Arrays.sort(charArr);

    /*
    -[리스트]
    1. <값과 포인터를 묶은 노드>를 포인터로 연결한 자료구조
        cf. 노드 : 값, 포인터를 쌍으로 갖는 기초 단위

    - 특징
    1. 인덱스가 없으므로 값에 접근하려면 Head 포인터부터 순서대로 접근해야 한다.
        = 값에 접근하는 속도가 느리다
    2. 포인터로 연결되어 있으므로, 데이터를 삽입하거나 삭제하는 연산 속도가 빠르다.
    3. 선언할 때 크기를 별도로 지정하지 않아도 된다.
        = 리스트의 크기는 정해져 있지 않으며, 크기가 변하기 쉬운 데이터를 다룰 때 적절하다.
    4. 포인터를 저장할 공간이 필요하므로 배열보다 구조가 복잡하다.
     */

        ArrayList<String> list = new ArrayList<>();

    }
}
