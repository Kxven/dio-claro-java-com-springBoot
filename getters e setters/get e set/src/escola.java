public class escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        // felipe.idade = 8;
        // felipe.nome = "Felipe";
        
        felipe.setNome("Felipe");
        felipe.setIdade(8);
        
        System.out.println("O Aluno " + felipe.getNome() + " Tem " + felipe.getIdade() + " Anos");
    }
}
