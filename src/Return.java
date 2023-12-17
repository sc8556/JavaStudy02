public class Return {
    void sayNick(String nick){ // 리턴값이 없는 메서드 생성
        if("바보".equals(nick)){ // 'nick' 변수의 값이 "바보" 와 같으면
            return; // return, 메서드 종료
        }
        System.out.println("나의 별명은 " + nick + " 입니다."); // 그렇지 않으면 출력문 실행

        /*
        - return 문만 단독으로 사용하여 메서드를 빠져나가는 이 방법은 리턴 자료형이 'void' 인 메서드만 가능
        - 리턴 자료형이 명시되어 있는 메서드에서 return 문만 작성하면 컴파일 에러가 발생한다.
         */
    }

    public static void main(String[] args) {
        Return result = new Return(); // 'result' 객체변수 선언
        result.sayNick("야호"); // 'result' 메서드 호출, 입력값: "야호"
        result.sayNick("바보"); // 'result' 메서드 호출, 입력값: "바보"
    }
}
