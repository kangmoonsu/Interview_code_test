package 위즈온X_code_test;

public class p2 { // 2단부터 9단까지 구구단의 결괏값 출력하기
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }
            System.out.println();
        }
    }
}
