package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection recuperarConexao() {
        try {
            return DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/byte_bank", "postgres", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
