import java.util.*;
import java.sql.*;
public class SelectTest1
{
public static void main(String args[]) throws Exception{
	
 Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
if(con!=null) System.out.println("connection established");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("SELECT * FROM EMP");
while(rs.next())
{
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+"  "+rs.getFloat(4));

}
rs.close();
st.close();
con.close();
}
}