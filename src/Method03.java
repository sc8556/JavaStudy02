class Updater { // 'Updater' 클래스 생성
    /* void update(int count){ // 'update' 메서드 생성
        count++;
    } // 기능: 전달받은 숫자를 1만큼 증가 시킴
    */
    void update(Counter counter){ // 입력값: 'Counter counter' 객체, 출력값: 없음
        counter.count++;
    }
}
class Counter{ // 'Counter' 클래스 생성
    int count = 0; // 객체변수
} // 기능: 'count' 객체변수를 생성함

public class Method03 {
    public static void main(String[] args) {
        Counter myCounter = new Counter(); // 객체변수 'myCounter' 선언
        System.out.println("before update: " + myCounter.count); // 객체변수 'count' 출력
        Updater myUpdater = new Updater(); // 'myUpdater' 객체변수 선언
//      myUpdater.update(myCounter.count); // 메서드 'update' 에 객체변수 'myCounter.count' 전달 - 값 변하지 않음
        myUpdater.update(myCounter); // 메서드 'update' 에 객체 'myCounter' 를 전달 - 값 변함
        System.out.println("after update: " + myCounter.count); // 객체변수 'count' 출력
    }
}
