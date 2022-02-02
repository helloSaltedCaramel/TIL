package com.company;

public class Java100_if_ThreeOperator {
    public static void main(String[] args) {
        //[1] 변수 선언
        int hour = 23;

        // [2] 삼항 연산자 테스트 -> 10 보다 작거나 같으면 100을 곱하시오.
        int test = hour <=10? hour*100: hour;
        System.out.println("[2]"+ test);

        // [3] 삼항 연산자를 이용하여 12시보다 작으면 오전, 크면 오후 출력
        String str1 = "오전";
        String str2 = "오후";
        String ampm = hour <12 ? str1 : str2;
        System.out.println("[3]"+ ampm);
    }
}
