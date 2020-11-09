//WAP  A JDBC APPLICATION TO GET EMPNO,ENAME,JOB,SAL FROM EMP DATABASE TABLE BASED ON GIVEN JOB BY ENDUSER
import java.sql.*;
import java.util.Scanner;
public class SelectTest5
{
public static void main(String args[]) throws Exception
{ 
Scanner scan=new Scanner(System.in);
System.out.println("enter employee job");
String job=scan.next();
job="'"+job+"'";
System.out.println(job);
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
Statement st=con.createStatement();
String query="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB= "+job;
System.out.println(query);
ResultSet rs=st.executeQuery(query);
boolean flag=false;
while(rs.next())
{flag=true;
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
}
if(flag==false) System.out.println("records not found");
else if(flag==true) System.out.println("records are found and displayed");
rs.close();
st.close();
con.close();
}
}