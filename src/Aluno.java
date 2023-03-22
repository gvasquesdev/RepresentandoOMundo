public class Aluno {
    public String nome;
    private String cpf;
    private int idade;
    private String curso;

    void inscrito () {
        System.out.println("Parabéns, você está inscrito");
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}


