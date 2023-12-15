package _05;

class Animal{
    // 2. 객체 변수란?
    // 클래스에 선언된 변수
    // 인스턴스 변수, 멤버 변수, 속성이라고도 한다.
    String name; // 객체 변수 선언

    // 3. 메서드란?
    /* [메서드를 사용하는 이유]
    여러 번 반복해서 사용되는 내용을 한 뭉치로 묶어서 리턴값을 출력하게 하기 위해서
      */

    public void setName(String name){ // 출력: void('리턴값 업음'을 의미)
        this.name = name; // 입력: String name
        // this의 의미는?
        // main에서 전달하는 000.setName에서 000이 this를 지칭
        // Ex.) dog.setName("happy") → this는 dog를 지칭함
        // 입력으로 name 이라는 문자열을 받고 출력은 없는 형태의 메서드
    }


}

public class Sample {
    // 입력값과 리턴값이 모두 있는 메서드
    int sum(int a, int b){ // int a, int b는 매개변수
        return a + b;
    }

    // 입력값이 없는 메서드
    String say(){
        return "Hi";
    } // 입력값: 없음, 리턴값: Hi

    // 리턴값이 없는 메서드
    void vsum(int a, int b){
        System.out.println("a + b는 " + (a+b) + " 입니다.");
    } // 입력값: int 자료형 a, int 자료형 b , 리턴값: void(리턴값 업음)

    // 입력값과 리턴값이 모두 없는 메서드
    void say2(){
        System.out.println("입력값과 리턴값이 모두 없는 메서드 ===== Hi");
    } // 입력값과 리턴값이 모두 없음

    public static void main(String[] args) {
        /* 학습목표
        1. 클래스와 객체
        2. 객체 변수란?
        3. 메서드란?
        4. 객체 변수는 공유되지 않는다.
         */

        // 1. 클래스와 객체
        Animal cat = new Animal(); // new는 객체를 생성할 때 사용하는 키워드이다.
                                    // 이렇게 하면 Animal 클래스의 인스턴스인 cat, 즉 Animal의 객체가 생성된다.
        cat.setName("body"); // 메서드 호출
        Animal dog = new Animal();
        dog.setName("happy"); // 메서드 호출
        Animal horse = new Animal();

        System.out.println(cat.name);
        System.out.println(dog.name);

        int a = 3;
        int b = 4;

        Sample sample = new Sample(); // 객체 생성 , 작성한 클래스를 단독으로 실행시켜 테스트할 때 자주 사용하는 방법
        int c = sample.sum(3,4); // 3, 4 는 인수

        System.out.println(c);

        String s = sample.say();

        System.out.println(s);

        sample.vsum(3,4);

        sample.say2();
    }
}
