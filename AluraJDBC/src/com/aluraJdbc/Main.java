package com.aluraJdbc;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "t1b0r", "password");
        System.out.println("Fechando conexao");
        conn.close();e
    }
}
