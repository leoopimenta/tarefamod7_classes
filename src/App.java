public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Pedro");
        pessoa.setAltura(1.90);
        pessoa.setIdade(26);
       
       System.out.println(pessoa.getNome());
       System.out.println(pessoa.getAltura());
       System.out.println(pessoa.getIdade());
    }
}
