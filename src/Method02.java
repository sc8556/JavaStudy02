
// 메서드란? 클래스 내에 구현된 함수
public class Method02 {
    /* [입력값과 리턴값이 모두 있는 메서드]
         입력값: int a, int b
         출력값: int 자료형
    */
    int sum(int a, int b){ // a, b 는 매개변수
        return a + b;
    }

    /* [입력값이 없는 메서드]
        입력값: 없음
        출력값: String 자료형
     */
    String say(){
        return "Hi";
    }

    /* [리턴값이 없는 메서드]
         입력값: int a, int b
         출력값: void (리턴값 없음)
     */
    void sum02(int a, int b){
        System.out.println(a + "과 " + b + "의 합은 " + (a + b) + "입니다.");
    }

    /* [입력값과 리턴값이 모두 없는 메서드]
          입력값: 없음
          리던값: void (리턴값 없음)
     */
    void say02(){
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        /* 메서드 호출방법
            리턴값을 받을 변수 = 객체.메서드명(입력인수1, 입력인수2, ...)
         */
        Method02 method = new Method02(); // 자기 자신의 객체 생성, 클래스를 단독으로 실행시켜 테스트할 때 자주 사용하는 방법
        int c = method.sum(3,4); // 3, 4 는 인수

        System.out.println(c);

        /* 메서드 호출방법
            리턴값을 받을 변수 = 객체.메서드명
         */
        String result = method.say();
        System.out.println(result);

        /* 메서드 호출방법
            객체.메서드명(입력인수1, 입력인수2, ...)
         */
        method.sum02(3,5);

        /* 메서드 호출방법
            객체.메서드명
         */
        method.say02();



    }
}
