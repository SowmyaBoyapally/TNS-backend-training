public class DriverTest {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("PostgreSQL Driver Loaded");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
