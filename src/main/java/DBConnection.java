


public class DBConnection {

    private String dbUrl;
    private String dbUsername;
    private String dbPassword;


    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }



    public void createDbConnection() {
        System.out.println("Database connection is created");
    }


    public void closeConnection() {
        System.out.println("Database connection is closed");
    }
}
