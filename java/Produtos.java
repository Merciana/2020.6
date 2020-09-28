public class Produtos {
    Integer id;
    String nome;
    String descricao;
    double precos;

    public Produtos(){
    }

    public Produtos(Integer id, String nome, String descricao, double precos){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.precos = precos;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getdescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public double getpreco(){
        return precos;
    }

    public void setPrecos(double precos) {
        this.precos = precos;
    }
}
