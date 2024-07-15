package com.human;

/*
 * 패키지가 다른 클래스를 사용할 경우
 * 1. 패키지 이름을 모두 작성
 * 2. import 구문을 이용
 * import com.human.var.ValuePrinter;
 */
import com.human.var.ValuePrinter;

public class Application {
    public static void main(String[] args) {
        System.out.println("안녕하세요!");
        System.out.println("휴먼교육센터에 오신걸 환영합니다");

        

        /* 코드는 대소문자를 구분
         * 코드는 코드블럭 안에 있어야함
         * 자동완성을 이용하면 오타를 줄일수 있음.
         

         * 메서드를 실행하고 싶을때
         * 1. 실행할 메서드가 있는 클래스를 생성한다.
         * 생성한다 == 메모리에 올려준다
         */
        // 클래스명 변수명 = new 클래스명();
        // 패키지가 다른경우 풀 경로(패키지명을 포함한 클래스명)를 입력
        // com.human.var.ValuePrinter vp = new com.human.var.ValuePrinter();
        ValuePrinter vp = new ValuePrinter();

        /*
         * 2. 메서드 호출 == 메서드 실행
         * 클래스의 변수명.메서드명
         * 
         * 3. 메서드를 확인하는 방법
         * ctrl + 메서드 클릭
         */

        vp.print();
    }

}
