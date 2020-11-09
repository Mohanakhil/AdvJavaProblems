//WAP TO CREATE JDBC APPLICATION THAT GIVES EMP DETAILS BASED ON EMPNO
import java.util.Scanner;
import java.sql.*;
public class SelectTest6
{ public static void main(String args[]) throws Exception
{ 
Scanner scan=new Scanner(System.in);
System.out.println("enter empno of employee");
int  empno=scan.nextInt();

String query= "SELECT * FROM EMP WHERE EMPNO="+empno;
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(query);
boolean flag=false;
while(rs.next())
{ System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getInt(6)+" "+rs.getString(7)+rs.getInt(8));
flag=true;
}
if(flag==false) System.out.println("records are not found");
else System.out.println("records are found and displayed");

}
}