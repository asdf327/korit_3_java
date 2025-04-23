package ch21_exception;

//사용자 정의 예외
class Login extends Exception {

    public Login(String message){
        super(message);
    }
}

public class Excption02 {
    public static void login(String id, String password) throws Login{
        String correctID  = "a";
        String correctPassword  = "1a";

        if (!id.equals(correctID ) || !password.equals(correctPassword)){
            throw new Login("아이디 또는 비밀번호가 틀렸습니다.");
        }
    }

    public static void main(String[] args) {
        String inputID = "admin";
        String inputPassword = "qwer1234";

        try {
            login(inputID, inputPassword);
            System.out.println("로그인 성공");
        } catch (Login e){
            System.out.println("로그인 실패 : " + e.getMessage());
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
