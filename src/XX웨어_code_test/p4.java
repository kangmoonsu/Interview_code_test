package XX웨어_code_test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
/*
이번 달의 “일요일”은 모두 몇 번 있을까?
예) 이번달이 2022년 1월인 경우, 답은 5가 나옴.
* */
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("년도를 입력하세요 (4자리): ");
        int year = sc.nextInt();

        System.out.print("월을 입력하세요 (1-12): ");
        int month = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);

        LocalDate firstDayOfMonth = date.withDayOfMonth(1);
        LocalDate lastDayOfMonth = date.withDayOfMonth(date.lengthOfMonth());

        int count = 0;
        while (!firstDayOfMonth.isAfter(lastDayOfMonth)) {
            if (firstDayOfMonth.getDayOfWeek() == DayOfWeek.SUNDAY) {
                count++;
            }
            firstDayOfMonth = firstDayOfMonth.plusDays(1);
        }
        System.out.println(year + "년 " + month + "월의 일요일 수: " + count + "개");
        sc.close();
    }
}
