import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
    public static void main(String[] args) {
        //variável de referência (semelhante aos ponteiros da linguagem C)
        //declarei uma variável
        //análogo a int a;
        LivroDeNotas livroDeNotas;
        //new constrói um objeto
        livroDeNotas = new LivroDeNotas();
        //estamos enviando a mensagem "exibirMensagem" ao 
        //objeto livro
        String nomeDoCurso = JOptionPane.showInputDialog("Digite o nome do curso");
        livroDeNotas.nomeDoCurso = nomeDoCurso;
        livroDeNotas.exibirMensagem();

        LivroDeNotas outroLivro = new LivroDeNotas();

        String outroNome = JOptionPane.showInputDialog("Nome do segundo curso");

        outroLivro.nomeDoCurso = outroNome;

        outroLivro.exibirMensagem();

        System.out.println("Terminando...");
    }
}
