import modelo.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO {
/
    private Connection connection;

    public CategoryDAO(Connection connection){
        this.connection = connection;
    }

    public List<Category> listar() throws SQLException {
        List<Category> categories = new ArrayList<>();

        String sql = "SELECT ID, NOME FROM CATEGORY";

        try(PreparedStatement pstm = connection.prepareStatement(sql)){
            pstm.execute();

            try(ResultSet rst = pstm.getResultSet()){
                while(rst.next()){
                    Category category = new Category(rst.getInt(1), rst.getString(2));

                    categories.add(category);
                }
            }
        }
        return categories;
    }
}
