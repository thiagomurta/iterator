package iterator;

public class Pessoa {
    private String nome;
    private boolean atualizado;

    public Pessoa(String nome, boolean atualizado){
        this.nome = nome;
        this.atualizado = atualizado;
    }

    public boolean isAtualizado() {
        return atualizado;
    }

    public void setAtualizado(boolean atualizado) {
        this.atualizado = atualizado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
