/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evoting;
import java.sql.*;
import static evoting.Provider.*;


/**
 *
 * @author Eva
 */
public class connectionprovider {
private static Connection con  =null;
static{
    try{
        Class.forName(driver);
        con=DriverManager.getConnection(CONNECTION_URL,username,password);
    }
    catch(Exception e){}
}
public static Connection getcon()
{
    return con ;

  }

    
}
