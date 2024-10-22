package SQ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class sql3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/lab4";
        String user = "root";
        String password = "123";
        
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            String query = "UPDATE CITY SET population = ? WHERE name = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, 1550000); 
            pstmt.setString(2, "Quetta"); 
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) updated.");
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
