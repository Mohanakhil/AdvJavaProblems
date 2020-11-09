//WAP TO CREATE JDBC APPLICATION TO GET DEPT DETAILS BASED ON GIVEN DEPTNO
import java.sql.*;
import java.util.Scanner;
public class SelectTest7
{ public static void main(String args[]) throws Exception
{ System.out.println("enter deptno");
Scanner scan=new Scanner(System.in);
int deptno=scan.nextInt();
String query="SELECT DNAME FROM DEPT WHERE DEPTNO= "+deptno;
System.out.println(query);
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");

Statement st=con.createStatement();
ResultSet rs=st.executeQuery(query);
boolean flag=false;
while(rs.next())
{ System.out.println(rs.getString("DNAME"));
flag=true;
}
if(flag==false) System.out.println("no records are found");
else System.out.println("records are found");
rs.close();
st.close();
con.close();
}
}