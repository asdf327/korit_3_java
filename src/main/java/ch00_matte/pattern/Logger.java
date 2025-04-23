package ch00_matte.pattern;

public class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance(){
        if (instance == null){
            synchronized (Logger.class){
                if (instance == null){
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message){
        System.out.println("Log: " + message);
    }

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println(logger1 == logger2);

        logger1.log("This is a log message.");
    }
}
