public class StringBuilder_StringBuffer {

}

class StringBuilder_Ex {
    public static void main(String[] args)  {
        String s = "abcdefg";
        StringBuilder sb = new StringBuilder(s); // String -> StringBuilder

        System.out.println("처음 상태 : " + sb); //처음상태 : abcdefg
        System.out.println("문자열 String 변환 : " + sb.toString()); //String 변환하기
        System.out.println("문자열 추출 : " + sb.substring(2,4)); //문자열 추출하기
        System.out.println("문자열 추가 : " + sb.insert(2,"추가")); //문자열 추가하기
        System.out.println("문자열 삭제 : " + sb.delete(2,4)); //문자열 삭제하기
        System.out.println("문자열 연결 : " + sb.append("hijk")); //문자열 붙이기
        System.out.println("문자열의 길이 : " + sb.length()); //문자열의 길이구하기
        System.out.println("용량의 크기 : " + sb.capacity()); //용량의 크기 구하기
        System.out.println("문자열 역순 변경 : " + sb.reverse()); //문자열 뒤집기
        System.out.println("마지막 상태 : " + sb); //마지막상태 : kjihgfedcba

        /*
        처음 상태 : abcdefg
        문자열 String 변환 : abcdefg
        문자열 추출 : cd
        문자열 추가 : ab추가cdefg
        문자열 삭제 : abcdefg
        문자열 연결 : abcdefghijk
        문자열의 길이 : 11
        용량의 크기 : 23
        문자열 역순 변경 : kjihgfedcba
        마지막 상태 : kjihgfedcba
         */
    }
}

class StringBuffer_Ex {
    public static void main(String[] args)  {
        String s = "abcdefg";
        StringBuffer sb = new StringBuffer(s); // String -> StringBuffer

        System.out.println("처음 상태 : " + sb); //처음상태 : abcdefg
        System.out.println("문자열 String 변환 : " + sb.toString()); //String 변환하기
        System.out.println("문자열 추출 : " + sb.substring(2,4)); //문자열 추출하기
        System.out.println("문자열 추가 : " + sb.insert(2,"추가")); //문자열 추가하기
        System.out.println("문자열 삭제 : " + sb.delete(2,4)); //문자열 삭제하기
        System.out.println("문자열 연결 : " + sb.append("hijk")); //문자열 붙이기
        System.out.println("문자열의 길이 : " + sb.length()); //문자열의 길이구하기
        System.out.println("용량의 크기 : " + sb.capacity()); //용량의 크기 구하기
        System.out.println("문자열 역순 변경 : " + sb.reverse()); //문자열 뒤집기
        System.out.println("마지막 상태 : " + sb); //마지막상태 : kjihgfedcba

        /*
        처음 상태 : abcdefg
        문자열 String 변환 : abcdefg
        문자열 추출 : cd
        문자열 추가 : ab추가cdefg
        문자열 삭제 : abcdefg
        문자열 연결 : abcdefghijk
        문자열의 길이 : 11
        용량의 크기 : 23
        문자열 역순 변경 : kjihgfedcba
        마지막 상태 : kjihgfedcba
         */
    }
}
