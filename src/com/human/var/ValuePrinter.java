/*
 * 기능별로 소스를 분리하여 작성
 * 패키지명은 .으로 구분하여 작성(자동입력 가능)
 */


package com.human.var;

/* 클래스의 선언부

 * 네이밍규칙
 * 1. 클래스명
 *   - 파일의 이름과 같은 이름(불일치시 컴파일 오류 발생)
 *   - 대문자로 시작, 여러 단어가 연결될 경우 카멜 표기법을 이용
 * 
 * 2. 메서드명 네이밍 규칙
 *   - 소문자로 시작, 여러 단어가 연결될 경우 카멜 표기법을 이용
 */
public class ValuePrinter {
    
    // 메서드 선언부 - 기능
    
    // 접근제한자 반환타입 메서드명(매개변수타입 매개변수명){}
    // 매개변수 : 외부로부터 받아오는 값
    // 반환타입 : 메서드의 실행결과 외부로 반환하는 값의 타입

    /**
     * 도큐먼트 주석
     * 주로 javadoc명령어로 API도큐먼트를 생성하는데 사용
     * 
     * 출력 메서드
     * 1. 숫자 출력
     * 2. 연산결과 출력
     * 3. 하나의 문자 출력
     * 4. 문자열 출력
     * 5. +연산자의 문자열 연결
     */
    public void print(){
        // 1. 숫자 출력
        System.out.println(123); // 정수 출력
        System.out.println(3.14); // 실수 출력

        // 2. 연산결과 출력
        System.out.println(10 + 20);
        System.out.println(10 / 2);  // 나누기
        System.out.println(10%2); // 나머지 연산자

        // 3. 하나의 문자 출력 : 홑따옴표(char type)
        System.out.println('a');
        System.out.println('가');

        // 4. 문자열 출력 : 쌍따옴표(String type)
        System.out.println("안녕하세요");
        System.out.println("휴먼교육센터 여러분!");

        // 5. 문자열과 더하기의 연산
        // 더하기 연산자와 문자열이 만나면 문자열을 연결하는 역할을 한다.
        System.out.println("문자와 숫자의 연산" + 1234);

    }

}
