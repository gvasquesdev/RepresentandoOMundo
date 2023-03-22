public class Professor {
    private String nome;
    private String especialidade;
    private Aluno aluno = new Aluno();

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNomeAluno (String nomeAluno) {
        this.aluno.nome = nomeAluno;
    } 

    public String getNomeAluno () {
        return this.aluno.nome;
    }
}