package XX웨어_code_test;

import java.util.Scanner;
/*
* 변수에 "HELLO"라고 저장된 값의 순서를 거꾸로 하여 화면에 출력하기
* (반복문을 사용하여 작성)
* */
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
        sc.close();
    }
}
