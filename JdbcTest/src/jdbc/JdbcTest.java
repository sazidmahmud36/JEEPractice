
package jdbc;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo";
        String userName = "root";
        String pass = "sazid364436";
        String query = "SELECT * FROM employees";
        
        try {
            //1. Get A Connection:
            Connection connection = DriverManager.getConnection(url, userName, pass);
            
            //2. create a statement object
            Statement stmt = connection.createStatement();
            
            //3. Execute sql query
            ResultSet resultset = stmt.executeQuery(query);
            
            //4. process result set
            while(resultset.next()){
                System.out.println(resultset.getString("first_name")+" "+resultset.getString("last_name"));
            }
            connection.close();


            
            
            
        } catch (Exception e) {
            
            System.out.println(e);
        }
    }
}
