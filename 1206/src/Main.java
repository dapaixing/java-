import java.sql.*;

/**
 * @author yolo
 * @date 2019/12/1-16:49
 * 1.注册驱动
 * 2.获取连接
 *     执行sql
 *     1.获取statement
 *     2.执行statement 并得到ResultSet
 *     3.读取ResultSet
 *     4.关闭ResultSet
 *     5.关闭statement
 * 3.关闭连接
 */
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1.注册Driver
        Class.forName("com.mysql.jdbc.Driver");//会抛出异常
        //通过DriverManager获取数据库连接
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java11?useSSL=false",
                "root",
                "root"
        );
        //关闭连接
        connection.close();
    }
}


