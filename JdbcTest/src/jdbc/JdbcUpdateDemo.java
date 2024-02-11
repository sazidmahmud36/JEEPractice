package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;


public class JdbcUpdateDemo {
    public static void main(String[] args) {
        Connection myConnection = null;
        Statement mystmt = null;
        ResultSet myRs = null;
        
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String password = "sazid364436";
        
        try {
             // get a connection to database
        myConnection = DriverManager.getConnection(url, user, password);
        
        // create a statement
        mystmt = myConnection.createStatement();
        // call helper method to display employee's information
//            System.out.println("Before the update");
//            displayEmployee(myConnection, "John", "Doe");


        // update the employee
            System.out.println("Executing the update:");
            mystmt.executeUpdate("UPDATE employees SET email='john@gmail.com' WHERE first_name='John' AND last_name='Doe'");
            
//            Call helper Method

            System.out.println("After the update...");
            
            
            myRs = mystmt.executeQuery("Select email FROM employees WHERE first_name='John' AND last_name='Doe'");
//            displayEmployee(myConnection, "John", "Doe");
            
            
            while(myRs.next()){
                System.out.println("email : " + myRs.getString("email"));
            }
            
            myConnection.close();
            
        
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

}
