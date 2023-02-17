import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 덱_스택_큐 {

    // ⭐ 1. 덱
    public static void main(String[] args) {
        Deque<Node> deque = new LinkedList<>();

        deque.addFirst(new Node(2, 3)); // 첫번째에 삽입
        deque.removeFirst(); // 첫번째꺼 삭제
        deque.addLast(new Node(2, 3)); // 마지막에 삽입
        deque.removeLast(); // 마지막꺼 삭제

        // 예시
        while (!deque.isEmpty() && deque.getLast().value > 3) {
            deque.removeLast();
        }
        deque.addLast(new Node(2, 3));

        if (7 - deque.getFirst().index >= 4 ) {
            deque.removeFirst();
        }

        System.out.println(deque.getFirst().value + " ");

    }

    static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    // ⭐ 2. 스택 : 깊이 우선 탐색(DFS), 백트래킹 종류의 코테에서 많이 쓰임 (후입선출 : 재귀 함수 알고리즘 원리와 비슷)
    public static void main2(String[] args) {

        Stack<Integer> stack = new Stack<>(); //int형 스택 선언
        Stack<String> stack2 = new Stack<>(); //char형 스택 선언

        stack.push(1);     // stack에 값 1 추가
        stack.push(2);     // stack에 값 2 추가
        stack.push(3);     // stack에 값 3 추가

        stack.pop();       // stack에 값 제거 (삭제+확인)
        stack.clear();     // stack의 전체 값 제거 (초기화)
        stack.peek();     // stack의 가장 상단의 값 출력(확인)

        stack.size();      // stack의 크기 출력
        stack.empty();     // stack이 비어있는지 check (비어있다면 true)
        stack.contains(1); // stack에 1이 있는지 check (있다면 true)

        /*
        [위치]
        top : 삽입과 삭제가 일어나는 위치
        [연산]
        push : top 위치에 새로운 데이터를 삽입하는 연산
        pop : top 위치에 현재 있는 데이터를 삭제하고 확인하는 연산
        peek : top 위치에 현재 있는 데이터를 단순 확인하는 연산
         */
    }

    // ⭐ 3. 큐 : 삽입과 삭제 연산이 선입선출, 너비 우선 탐색(BFS)에서 자주 사용
    public static void main3(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); //int형 queue 선언, linkedlist 이용
        Queue<String> queue2 = new LinkedList<>(); //String형 queue 선언, linkedlist 이용

        // 추가 : add(value) 또는 offer(value)
        // add(value) : 삽입에 성공하면 true를 반환, 큐에 여유 공간이 없어 삽입 실패 시 IllegalStateException 발생
        queue.add(1);     // queue에 값 1 추가
        queue.add(2);     // queue에 값 2 추가
        queue.offer(3);   // queue에 값 3 추가

        // 제거
        queue.poll();       // queue에 첫번째 값을 반환하고 제거, 비어있다면 null
        queue.remove();     // queue에 첫번째 값 제거

        queue.peek();       // queue의 첫번째 값 참조
        queue.clear();      // queue 초기화

        /*
        [위치]
        rear : 큐에서 가장 끝 데이터를 가리키는 영역
        front : 큐에서 가장 앞의 데이터를 가리키는 영역
        [연산]
        add : rear 부분에 새로운 데이터를 삽입하는 연산
        poll : front 부분에 있는 데이터를 삭제하고 확인하는 연산
        peek : 큐의 맨 앞(front)에 있는 데이터를 확인할 때 사용하는 연산
         */
    }

    // ⭐ 4. 우선순위 큐 : 값이 들어간 순서와 상관 없이 우선순위가 높은 데이터가 먼저 나오는 자료구조
    // 우선순위 큐 설정에 따라 front에 항상 최댓값 또는 최솟값이 위치함
    public static void main4(String[] args) {
        // 추후 내용 추가 예정
    }
}
