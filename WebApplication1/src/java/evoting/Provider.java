/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evoting;

/**
 *
 * @author Eva
 */
public interface  Provider {
    
    String driver ="com.mysql.jdbc.driver";
    String CONNECTION_URL="jdbc:mysql://localhost:3306/DB?autoRecoonect=true&useSSL=false";
    String username="root";
    String password="12345678";
    
}
