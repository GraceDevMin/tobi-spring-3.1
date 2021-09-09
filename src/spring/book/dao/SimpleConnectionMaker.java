package spring.book.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker {    // 더 이상 상속을 이용한 확장 방식을 사용할 필요가 없으므로 추상 클래스 X
    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection c = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
        return c;
    }
}
