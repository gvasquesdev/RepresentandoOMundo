public class App {
    public static void main(String[] args) throws Exception {
        Professor frank = new Professor();

        frank.setNome("frank");
        frank.setNomeAluno("Wesley");
        System.out.print(frank.getNomeAluno());
    }
}
