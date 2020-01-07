package lib;


import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class chaRuShiCiDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String chaoDai = "唐代";
        String zuZhe = "白居易";
        String tiMu = "问刘十九";
        String zhenWen = "绿蚁新醅酒，红泥小火炉。晚来天欲雪，能饮一杯无？";

//        Class.forName("com.mysql.jdbc.Driver");
//        String url = ""

        MysqlConnectionPoolDataSource dataSource = new MysqlConnectionPoolDataSource();//这个函数带有池子，好处参考线程池
        dataSource.setServerName("127.0.0.1");
        dataSource.setPort(3306);
        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setDatabaseName("tangshi");
        dataSource.setUseSSL(false);
        dataSource.setCharacterEncoding("UTF8");

        try(Connection connection = dataSource.getConnection()){
            String sql = "INSERT INTO t_tangshi"+
                    "(sha256, dynasty, title, author, " +
                    "content, words) " +
                    "VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, "sha256");
                statement.setString(2, 朝代);
                statement.setString(3, 标题);
                statement.setString(4, 作者);
                statement.setString(5, 正文);
                statement.setString(6, "");

                statement.executeUpdate();
            }
        }

    }
}
