package User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ConnectDB.ConnectDB;

//user data와 DB연동
public class UserDAO {
    Connection conn = ConnectDB.getConnetcion();
    private ResultSet rs;
    private PreparedStatement pstmt;

    public int join(User user) {
        int result = 0;
        String SQL = "insert into USER values(?,?,?,?)";
        try {
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, user.getID());
            pstmt.setString(2, user.getPW());
            pstmt.setString(3, user.getNAME());
            pstmt.setString(4, user.getPNUM());

        result = pstmt.executeUpdate();

        if (result > 0) {
            System.out.println("가입이 완료되었습니다.");
        }else{
            System.out.println("가입이 실패했습니다.");
        }
        pstmt.close();
        }catch (Exception e) {
            System.out.println(e.toString());
        }
        return result;
    }
    //로그인
    public int UserLogin(String ID, String PW) {
        String SQL = "SELECT PW FROM USER WHERE ID = ?";
        try{
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, ID);
            rs = pstmt.executeQuery();
            if(rs.next()) {
                if(rs.getString(1).equals(PW))
                    return 1; //로그인 성공
                else
                    return 0; //비밀번호 오류
            }
            else {
                return -1; //아이디 오류
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return 2;//DB오류
    }





}
