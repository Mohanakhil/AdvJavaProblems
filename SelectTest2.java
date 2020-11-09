//wap to create jdbc application to get all records of department table(predefined table in oracle)
import java.sql.*;
public class SelectTest2
{
public static void main(String args[]) throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("SELECT * FROM DEPT");
while(rs.next())
{
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));

}
rs.close();
st.close();
con.close();

}

}