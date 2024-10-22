package SQ;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sql2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/lab4";
        String user = "root";
        String password = "123";
        
        try {
            
            Connection con = DriverManager.getConnection(url, user, password);
            String query = "SELECT * FROM CITY WHERE country_id = 1"; 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("City ID: " + rs.getInt("id"));
                System.out.println("City Name: " + rs.getString("name"));
                System.out.println("Population: " + rs.getInt("population"));
                System.out.println("Rating: " + rs.getInt("rating"));
                System.out.println("--------------------");
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
