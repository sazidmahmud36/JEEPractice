package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class JdbcInsertDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo";
        String userName = "root";
        String password = "sazid364436";
        
        
        try {
            // get connection
            Connection myConnection = DriverManager.getConnection(url, userName, password);
            
            //create statement object
            Statement myStmt = myConnection.createStatement();
            
            //Insert a new employee
            
            System.out.println("Inserting a new employee to database \n");
            int rowsAffected = myStmt.executeUpdate("INSERT INTO employees (last_name,first_name,email,department,salary) VALUES ('Mahmud','Sazid','sazid@gmail.com','CEO',500000)");
            
            //Verify this by getting a list of employee
            ResultSet myResult = myStmt.executeQuery("SELECT * FROM employees ORDER BY first_name");
            
            //process resultSet
            while(myResult.next()){
                System.out.println(myResult.getString("first_name") + " " + myResult.getString("last_name"));
            }
            
            myConnection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
