//wap to create jdbc application to get all records from the salgrade(predefined table in oracle)
import java.sql.*;
public class SelectTest3
{public static void main(String args[]) throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");//this line is to work with older versions of jdbc
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");//Autoloading of driver class
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("SELECT *FROM SALGRADE");
while(rs.next())
{System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getInt(3));//to get the records of the table

}
rs.close();
st.close();
con.close();//closing connection in reverse order

}
}