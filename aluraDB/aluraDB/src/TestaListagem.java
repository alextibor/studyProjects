import java.sql.*;
import java.util.List;

public class TestaListagem {

public static void main(String[]args) throws SQLException{
    Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC",
            "t1b0r", "password");

    Statement stm = conn.createStatement();
    boolean resultado = stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");

    System.out.println(resultado);

    ResultSet rst = stm.getResultSet();

    while(rst.next()){
        Integer id = rst.getInt("ID");
        System.out.print(id + " ");
        String nome = rst.getString("NOME");
        System.out.print(nome + " ");
        String descricao = rst.getString("DESCRICAO");
        System.out.print(descricao);
    }
    conn.close();
    }
}
