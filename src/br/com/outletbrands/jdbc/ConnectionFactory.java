package br.com.outletbrands.jdbc;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public Connection getConnection() {
        
        try {
            return (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/BDOUTBRANDS","user","123");
        } catch(SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
}
