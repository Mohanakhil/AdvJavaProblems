//WAP TO CREATE JDBC APPLICATION TO GET ALL RECORDS OF THE EMP TABLE(PREDEFINED TABLE OF ORACLE)
import java.sql.*;
public class SelectTest4
{
	public static void main(String args[]) throws Exception
{ Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("SELECT *FROM EMP");
while(rs.next())
{ System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getInt(6)+" "+rs.getString(7)+" "+rs.getInt(8));
}
rs.close();
st.close();
con.close();
}
}