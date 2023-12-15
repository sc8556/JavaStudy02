package _03;

public class _03_01_Number {
    public static void main(String[] args) {
        /* 정수 - int, long
        - 표현범위
            int : -2147483648 ~ 2147483647
            long : -9223372036854775808 ~ 9223372036854775807
         */
        int age = 10; // -2147483648 ~ 2147483647 범위 안에 존재하기 때문에 int로 선언 가능
        long countOfStar = 8764827384923849L; // 큰 숫자에 접미사 L을 누락하면 컴파일 오류가 발생한다.

        /* 실수 - float, double
        - 표현범위
            float: -3.4 * 10³⁸ ~ 3.4 * 10³⁸
            double: -1.7 * 10³⁰⁸ ~ 1.7 * 10³⁰⁸
            */
        float pi = 3.14F;
        double morePi = 3.14159265358979323846;

        double d1 = 123.4;
        double d2 = 1.234e2; // e2는 제곱을 의미한다. 1.234 * 10 * 10² 이 되어 123.4가 되는 것이다.
    }
}
