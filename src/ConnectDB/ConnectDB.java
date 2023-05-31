package ConnectDB;

import java.sql.*;
//db연결 상태 관리
public class ConnectDB {
    public static Connection getConnetcion() {
        try{
            String URL = "jdbc:mysql://localhost:3306/ESQL?serverTimezone=UTC";
            String USERNAME = "root";
            String PASSWORD = "6820";
            Class.forName("com.mysql.jdbc.Driver");

            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}