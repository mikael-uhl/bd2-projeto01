package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection recuperarConexao() {
        try {
            return DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/byte_bank?user=root&password=admin");
        } catch (SQLException e) {
            try {
                return DriverManager
                        .getConnection("jdbc:postgresql://localhost:5432/byte_bank", "postgres", "");
            } catch (SQLException f) {
                throw new RuntimeException(f);
            }
        }
    }
}
