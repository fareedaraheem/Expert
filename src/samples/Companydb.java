package samples;
import java.sql.*;

/**
 * Created by expert on 8/3/18.
 */
public class Companydb {

    public static void main(String[] args) throws ClassNotFoundException,SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/companydb","root","root");
        Statement statement=connection.createStatement();
        ResultSet rs= statement.executeQuery("select avg(salary) from Employee");


        while(rs.next()){

            System.out.println("Average salary:" +rs.getInt(1));
        }

        Statement statement1=connection.createStatement();
        ResultSet rs1= statement1.executeQuery("select * from Product order by name");
        while(rs1.next()){

            System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getInt(3)+" "+rs1.getInt(4));
        }

        Statement statement2=connection.createStatement();
        ResultSet rs2= statement2.executeQuery("select * from Employee where salary>15000 and gender='m'");

        while(rs2.next()){

            System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+rs2.getString(3)+" "+rs2.getInt(4));
        }

        Statement statement3=connection.createStatement();
         statement3.executeUpdate("update Product set price=145 where idProduct=102");
         ResultSet rs3=statement3.executeQuery("select * from Product");
         while(rs3.next()){

             System.out.println(rs3.getInt(1)+" "+rs3.getString(2)+" "+rs3.getInt(3)+" "+rs3.getInt(4));
         }


        CallableStatement cs=connection.prepareCall(""+"{call getMaximum}");
         ResultSet rs4=cs.executeQuery();
         while(rs4.next()){

             System.out.println(rs4.getInt(1));
         }




    }
}
