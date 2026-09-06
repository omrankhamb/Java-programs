public class TestDriver {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("✅ Driver loaded successfully!");
        } catch (Exception e) {
            System.out.println("❌ Driver not found: " + e);
        }
    }
}
