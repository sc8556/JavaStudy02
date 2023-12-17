class Animal02{ // 'Animal02' 클래스 생성
    String name; // 'name' 이라는 String 변수 추가 OR 객체 변수 선언

    // 클래스에 의해 생성되는 것은 객체, 클래스에 선언된 변수는 객체 변수

    // 'setName' 메서드 생성
    // 입력: String name, 출력: void
    // void란? '리턴값 없음' 을 의미
    public void setName(String name){
        this.name = name;
    }
}
// 메서드란? 클래스 내에 구현된 함수
public class Method {
    public static void main(String[] args) {
        Animal02 cat = new Animal02(); // 'new' 는 객체를 생성할 때 사용하는 키워드.
        // 'Animal02' 클래스의 인스턴스인 'cat', 즉 Animal02의 객체가 만들어진다.

        /* 객체변수 사용하는 방법
           : 객체.객체변수
           객체변수에 값을 대입하는 방법
           : 객체.객체변수 = 값
          */
        cat.setName("body"); // 메서드 호출

        Animal02 dog = new Animal02();
        dog.setName("happy");

        System.out.println(cat.name); // 객체: 'cat' , 객체변수: 'name'
        System.out.println(dog.name); // 객체: 'cat' , 객체변수: 'name'

    }
}
