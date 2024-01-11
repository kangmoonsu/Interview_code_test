package X리소프X_code_test;

public class p1 {     // DecimalFormat을 사용하지 않고 입력값을 10000 -> 10,000으로 출력되게 하는법
    public static void main(String[] args) {
        int value = 10000;
        String numStr = Integer.toString(value);
        StringBuilder formatValue = new StringBuilder();
        int length = numStr.length();
        for (int i = 0; i < length; i++) {
            formatValue.append(numStr.charAt(i));

            if (i < length - 1 && (length - 1 - i) % 3 == 0) {
                formatValue.append(",");
            }
        }
        System.out.println(formatValue.toString());
    }
}
