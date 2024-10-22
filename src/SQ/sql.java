package SQ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class sql {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/lab4";
        String user = "root";
        String password = "123";
        
        try {
         
            Connection con = DriverManager.getConnection(url, user, password);
            String query = "INSERT INTO CITY (id, name, country_id, population, rating) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, 6); 
            pstmt.setString(2, "Quetta"); 
            pstmt.setInt(3, 1); 
            pstmt.setInt(4, 1001200); 
            pstmt.setInt(5, 3); 
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted.");
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
