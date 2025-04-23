package ch00_review;

public class Logger {
    private static Logger instance; // static 변수로 싱글턴 인스턴스를 관리
    private Logger() {
        System.out.println("Logger 객체가 생성되었습니다.");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("로그 메시지: " + message);
    }
}
