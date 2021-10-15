import java.sql.*;

public class TestaInsercaoComParametro {

    public static void main(String[] args) throws SQLException {
        String nome = "Mouse";
        String descricao = "Mouse Sem fio";
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperarConexao();

        PreparedStatement stm =
                connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)"
                        , Statement.RETURN_GENERATED_KEYS);

        adicionaVariavel("SmartTV", "45 Polegadas", stm);
        adicionaVariavel("Radio", "AM/FM", stm);
    }

    private static void adicionaVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
        stm.setString(1, nome);
        stm.setString(2, descricao);

        stm.execute();

        ResultSet rst = stm.getGeneratedKeys();
        while(rst.next()){
            Integer id = rst.getInt(1);
            System.out.println("O id criado foi " + id);
        }
        rst.close();
    }
}
