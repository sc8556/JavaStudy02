class Animal01{ // 'Animal' 클래스 생성
    String name; // 'name' 이라는 String 변수 추가 OR 객체 변수 선언

    // 클래스에 의해 생성되는 것은 객체, 클래스에 선언된 변수는 객체 변수
}

public class Class {
    public static void main(String[] args) {
        Animal01 cat = new Animal01(); // 'new' 는 객체를 생성할 때 사용하는 키워드.
        // 'Animal01' 클래스의 인스턴스인 'cat', 즉 Animal01의 객체가 만들어진다.

        //객체변수 사용하는 방법
        // 객체.객체변수
        System.out.println(cat.name); // 객체: 'cat' , 객체변수: 'name'

    }
}
