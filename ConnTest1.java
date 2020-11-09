import java.sql.*;
public class ConnTest1
{
public static void main(String args[])throws Exception
{
oracle.jdbc.driver.OracleDriver driver =new oracle.jdbc.driver.OracleDriver();
DriverManager.registerDriver(driver);
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
if(con==null)
System.out.println("not established connection");
else System.out.println("connection established");

}
}