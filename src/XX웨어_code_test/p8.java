package XX웨어_code_test;

/*
회원가입 중 비밀번호 검증하기

* 영문 포함
* 숫자 포함
* 특수문자(+=%_!@#$^&*?) 포함
* 8자이상

아래의 조건을 충족하는 정규식을 작성한다.
*/
public class p8 {
    public static void main(String[] args) {
        String regex = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[+=%_!@#$^&*?]).{8,}$";

        String password1 = "Passw0rd!";
        String password2 = "WeakPwd1";

        System.out.println(password1.matches(regex)); // true
        System.out.println(password2.matches(regex)); // false
    }
}
