package modelo;

public class Category {
    private Integer id;
    private String nome;

    public Category(Integer id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
