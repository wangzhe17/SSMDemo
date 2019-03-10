import java.sql.*;

public class Test {
    @org.junit.Test
    public void test() {

        String url = "jdbc:mysql://localhost:3306/mysql?useUnicode=true&amp;characterEncoding=UTF-8";
        String driver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driver);
        } catch (Exception e) {
            System.out.println("无法加载驱动");
        }

        try {
            Connection con = DriverManager.getConnection(url, "root", "123456");
            if (!con.isClosed())
                System.out.println("success");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
