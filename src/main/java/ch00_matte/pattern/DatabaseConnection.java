package ch00_matte.pattern;

public class DatabaseConnection {
    private String databaseUrl;
    private String username;
    private String password;

    private static DatabaseConnection instance;

    private DatabaseConnection(String databaseUrl, String username, String password) {
        this.databaseUrl = databaseUrl;
        this.username = username;
        this.password = password;
    }

    public static DatabaseConnection getInstance(String databaseUrl, String username, String password){
        if (instance == null){
            synchronized (DatabaseConnection.class){
                if (instance == null){
                    instance = new DatabaseConnection(databaseUrl, username, password);
                }
            }
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connecting to the database...");
    }

    public static void main(String[] args) {
        DatabaseConnection connection1 = DatabaseConnection.getInstance("jdbc:mysql://localhost:3306/mydb", "root", "password");
        DatabaseConnection connection2 = DatabaseConnection.getInstance("jdbc:mysql://localhost:3306/mydb", "root", "password");

        System.out.println(connection1 == connection2); // true로 출력되도록 구현

        connection1.connect();
    }

}
