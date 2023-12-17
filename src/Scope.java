public class Scope {


    void varTest(int a) {
//        this.a++; // 입력값 증감
        a++; // 입력값 증감
    }
/*
    - this 활용하기 -
    int a;

    void varTest() {
        this.a++; // 입력값 증감
        a++; // 입력값 증감
                    }
 */

    int varTest02(int a){
        a++; // 입력값 증감
        return a; // 증감한 값 반환
    }

    public static void main(String[] args) {
        int a = 1;
        Scope result = new Scope(); // 객체 변수 선언
        result.varTest(a); // 'varTest' 메서드 호출, 입력값: 'int a'
        System.out.println(a); // a 값 출력

        a = result.varTest02(a); // 'varTest02' 메서드 호출 후 a 변수에 할당, 입력값: 'int a'
        System.out.println(a); // a 값 출력

        /*
        result.a = 1;
        result.varTest();
        System.out.println(result.a);
        */
    }
}
