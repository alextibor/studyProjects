import modelo.Category;
import modelo.Produto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaListagemDeCategorias {

    public static void main(String[] args) throws SQLException {

        try(Connection connection = new ConnectionFactory().recuperarConexao()){
            CategoryDAO categoryDAO = new CategoryDAO(connection);
            List<Category> listaDeCategories = categoryDAO.listar();
            listaDeCategories.stream().forEach(ct -> {
                System.out.println(ct.getNome());
                for (Produto produto : new ProdutoDAO(connection).buscar(ct)){
                    System.out.println(ct.getNome() + " " + produto.getNome());
                }
            });
        }

    }
}
