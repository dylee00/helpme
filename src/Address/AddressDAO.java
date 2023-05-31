package Address;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ConnectDB.ConnectDB;
public class AddressDAO {
    Connection conn = ConnectDB.getConnetcion();
    private ResultSet rs;
    private PreparedStatement pstmt;


}
