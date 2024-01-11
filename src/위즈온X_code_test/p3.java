package 위즈온X_code_test;

public class p3 {
    /*
     if와 for문을 사용하여 아래를 출력하기

     *
     ***
     *****
     *******
     *********
     *******
     *****
     ***
     *

     */
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n * 2 - 1; i++) {
            int stars = (i <= n) ? i : (n * 2 - i);
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}