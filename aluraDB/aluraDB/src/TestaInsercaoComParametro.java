import java.sql.*;

public class TestaInsercaoComParametro {

    public static void main(String[] args) throws SQLException {

        ConnectionFactory factory = new ConnectionFactory();
        try(Connection connection = factory.recuperarConexao()){

            connection.setAutoCommit(false);

            try(PreparedStatement stm =
                        connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)"
                                , Statement.RETURN_GENERATED_KEYS);)
            {
                adicionaVariavel("SmartTV", "45 Polegadas", stm);
                adicionaVariavel("Radio", "AM/FM", stm);

                connection.commit();
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("ROLLBACK EXECUTADO");
            }
            connection.rollback();
        }
    }

    private static void adicionaVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
        stm.setString(1, nome);
        stm.setString(2, descricao);

        stm.execute();
        try(ResultSet rst = stm.getGeneratedKeys();){
            while(rst.next()){
                Integer id = rst.getInt(1);
                System.out.println("O id criado foi " + id);
            }
        }
    }
}
