package jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class JdbcDeleteDemo {
    public static void main(String[] args) {
        
        Connection myCon = null;
        Statement myStmt = null;
        ResultSet myRs = null;
        
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String pass = "sazid364436";
        
        try {
            myCon = DriverManager.getConnection(url, user, pass);
            myStmt = myCon.createStatement();
            //before Delete
            System.out.println("After Deleting");
            
            myRs = myStmt.executeQuery("DELETE FROM employees WHERE id=1");
            
            while(myRs.next()){
//                System.out.println("first_name");
                
            }
            myRs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
