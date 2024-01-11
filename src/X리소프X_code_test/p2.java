package X리소프X_code_test;

public class p2 {
    public static void main(String[] args) {
		/*
		입력값으로 hhmmss형태의 시분초가 입력되고 그 뒤에는 초가 입력됩니다, 해당 클래스를 메소드로 구현해주세요.
		100000 , 181이 입력된다고하면 100301 출력
		*/

        int initialTime = 100000; // 시분초 형태의 입력값
        int secondsToAdd = 181;   // 추가할 초

        int finalTime = addSeconds(initialTime, secondsToAdd);
        System.out.println(finalTime);


    }
    public static int addSeconds(int initialTime, int secondsToAdd) {

        int hours = initialTime / 10000;          // 시간
        int minutes = (initialTime % 10000) / 100; // 분
        int seconds = initialTime % 100;           // 초

        seconds += secondsToAdd;

        minutes += seconds / 60;
        seconds %= 60;

        hours += minutes / 60;
        minutes %= 60;

        int finalTime = (hours * 10000) + (minutes * 100) + seconds;
        return finalTime;
    }
}
