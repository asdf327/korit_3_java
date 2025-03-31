package ch00_review;

public class Review15 {
    public static void main(String[] args) {
        ConfigurationManager configur1 = ConfigurationManager.getInstance();

        configur1.setConfig("A", "B");
        System.out.println(configur1.getConfig("C"));
    }
}
