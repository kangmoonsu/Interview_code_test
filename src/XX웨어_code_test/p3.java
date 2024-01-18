package XX웨어_code_test;

import java.util.*;

/*
문자열의 내용을 임의로 섞어서 새로운 문자열로 조합하기
예) “1234567890” -> “4065197823”
위의 예제와 같이 입력받은 문자 또는 숫자의 순서를 임의(random)로 바꾸어서 재배열해 본다.
* */
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] charArr = str.toCharArray();

        Random random = new Random();

        for(int i = charArr.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
        }
        String shuffledStr = new String(charArr);

        System.out.println(shuffledStr);
        sc.close();
    }
}
