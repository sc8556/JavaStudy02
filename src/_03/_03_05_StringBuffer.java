package _03;

public class _03_05_StringBuffer {
    public static void main(String[] args) {
        // StringBuffer는 문자열을 추가하거나 변경할 때 주로 사용하는 자료형이다.
        /* StringBuffer의 다양한 메서드
        1. append
        2. insert
        3. substring
         */

        // 다음은 StringBuffer 객체를 생성하고 문자열을 생성하는 예제
        StringBuffer sb1 = new StringBuffer(); // StringBuffer 객체 sb 생성
        sb1.append("hello");
        sb1.append(" ");
        sb1.append("jump to java");
        String result1 = sb1.toString();
        System.out.println(result1);

        // String 자료형을 사용하여 문자열을 생성하고 변경하는 예제
        String result2 = "";
        result2 += "hello";
        result2 += " ";
        result2 += "jump to java";
        System.out.println(result2);

        /* 첫 번째 예제와 두 번째 예제의 결과는 같지만 내부적으로 객체를 생성하고 메모리를 사용하는 과정은 다르다.
        첫 번째 예제에서는 StringBuffer 객체를 한 번만 생성하지만, 두 번째 에제에서는 String 자료형에 + 연산이
        있을 때마다 새로운 String 객체를 생성하므로 총 4개의 String 자료형 객체가 만들어진다.

        String 자료형은 값이 한 번 생성되면 변경할 수가 없다. toUpperCase와 같은 메서드를 보면 문자열이 변경되는 것처럼
        생각할 수도 있지만 해당 메서드를 수행할 때 또 다른 String 객체를 생성하여 리턴할 뿐이다. 반면에 StringBuffer 자료형은
        값을 변경할 수 있으므로 생성된 값을 언제든지 수정할 수 있다.

        - 값을 변경할 수 없는 것을 '이뮤터블 하다', 변경할 수 없는 것을 '뮤터블 하다' 라고 한다. -

        StringBuffer 자료형은 String 자료형보다 무거운 편에 속한다. new StringBuffer()로 객체를 생성하면
        String을 사용할 때보다 메모리 사용량도 많고, 속도도 느리다. 따라서 문자열을 추가하거나 변경하는 작업이 많으면 StringBuffer를,
        그렇지 않으면 String을 사용하는 것이 유리하다.
         */

        // StringBuilder
        // StringBuilder는 StringBuffer와 비슷한 자료형으로, 사용법도 동일하다.
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result3 = sb.toString();
        System.out.println(result3);

        /* StringBuffer는 멀티 스레드 환경에서 안전하고, StringBuilder는 StringBuffer보다 성능이 우수하다는 장점이 있다.
        따라서 동기화를 고려할 필요가 없는 상황에서는 StringBuilder를 사용하는 것이 유리하다.
         */

        // insert
        // insert 메서드는 특정 위치에 원하는 문자열을 삽입할 수 있다.
        // insert를 사용하여 0번째 위치에 hello라는 문자열을 삽입해보는 예제
        StringBuffer sb2 = new StringBuffer();
        sb2.append("jump to java");
        sb2.insert(0,"hello ");
        System.out.println(sb2.toString());

        // substring
        // substring 메서드는 String 자료형의 substring 메서드와 동일하게 동작한다.
        StringBuffer sb3 = new StringBuffer();
        sb3.append("Hello jump to java");
        System.out.println(sb3.substring(0,4));
    }
}
