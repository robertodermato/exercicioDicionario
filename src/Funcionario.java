public class Funcionario {

    private String nome, cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String toString(){
        return "Nome: " + nome + ", Cargo:" + cargo;
    }

}
