import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
    public static void main(String[] args) {
       
        LivroDeNotas livro1 = new LivroDeNotas("ADS");
        LivroDeNotas livro2 = new LivroDeNotas("CCP");
        // System.out.println(livro1.getNomeCurso());
        // System.out.println(livro2.getNomeCurso());
        livro1 = livro2;
        // System.out.println (livro1.getNomeCurso());
        // System.out.println (livro2.getNomeCurso());
        livro2.setNomeCurso("Matematica");
        System.out.println (livro1.getNomeCurso());
        System.out.println (livro2.getNomeCurso());
       
       
    }
}
