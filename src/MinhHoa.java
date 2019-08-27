/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author w7
 */
import java.sql.*;
public class MinhHoa {
    
    public static void main(String args[])
    {
        Connection cnn = null;
        Statement stnt =null;
        ResultSet rst = null;
        try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://PC232\\SQLSERVER;" +
			"databaseName=QLSanPham;";
            cnn= DriverManager.getConnection(url,"sa","123456");
            stnt= cnn.createStatement();
            rst = stnt.executeQuery("*select*from LoaiSP");
            while (rst.next())
            {
                System.out.println(rst.getString(1)+"-"+ rst.getNString(2));
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }                                   
            

            
        }
    }
    

