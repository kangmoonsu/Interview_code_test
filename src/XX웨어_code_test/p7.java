package XX웨어_code_test;
/*
아래의 수열에서 다음의 수를 화면에 출력하자
1
11
12
1121
122111
위의 수열은 일명 “개미수열” 로, 연속된 같은 수의 개수를 묶어서 읽는 방식으로 만들어진다.
재귀적 용법 사용
*/
public class p7 {
    public static void main(String[] args) {
        int n = 5;
        String ant = "1";

        System.out.println(ant);

        for (int i = 1; i < n; i++) {
            StringBuilder nextAnt = new StringBuilder();
            char currentDigit = ant.charAt(0);
            int count = 1;

            for (int j = 1; j < ant.length(); j++) {
                if (ant.charAt(j) == currentDigit) {
                    count++;
                } else {
                    nextAnt.append(count).append(currentDigit);
                    currentDigit = ant.charAt(j);
                    count = 1;
                }
            }

            nextAnt.append(count).append(currentDigit);
            ant = nextAnt.toString();

            System.out.println(ant);
        }
    }
}
