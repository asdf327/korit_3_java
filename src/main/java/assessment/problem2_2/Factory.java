package assessment.problem2_2;

public class Factory {
    private String factoryName;

    private static Factory instance;

    private Factory(String factoryName) {
        this.factoryName = factoryName;
    }

    public static Factory getInstance(String factoryName) {
        if (instance == null){
            synchronized (Factory.class){
                if (instance == null){
                    instance = new Factory(factoryName);
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Factory factory1 = Factory.getInstance("삼성");
        Factory factory2 = Factory.getInstance("삼성");

        System.out.println(factory1 == factory2);
    }
}
