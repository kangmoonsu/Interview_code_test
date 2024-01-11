package 위즈온X_code_test;

public class p1 { // 1부터 100까지의 합계 구하기
    public static void main(String[] args) {
        int n = 100;
        int sum = calculateSum(n);
        System.out.println(sum);
    }
    // 1부터 n까지의 합을 계산하는 메서드
    public static int calculateSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
