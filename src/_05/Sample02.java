package _05;

class Updater {
    void update(Counter counter){
        counter.count++;
    }
} // 전달받은 숫자를 1만큼 증가시키는 메서드
class Counter {
    int count = 0; // 객체변수
}
public class Sample02 {
    public static void main(String[] args) {
        Counter myCounter = new Counter(); // Counter 클래스에 대한 myCounter 객체변수 선언

        System.out.println("before update: " + myCounter.count); // 0

        Updater myUpdater = new Updater(); // Updater 클래스에 대한 myUpdater 객체변수 선언
        myUpdater.update(myCounter);

        System.out.println("after update: " + myCounter.count);
    }
}
