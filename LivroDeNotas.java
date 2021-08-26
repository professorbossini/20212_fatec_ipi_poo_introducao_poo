public class LivroDeNotas{
    
    //variável de instância
    //instância é sinônimo de objeto
    //ela chama variável de instância pois cada instância tem a sua própria cópia dela
    String nomeDoCurso;

    
    //esse é um método de instância
    public void exibirMensagem (){
        //System.out.println("Bem vindo ao seu livro de notas");
        System.out.printf("Bem vindo ao livro de notas do curso %s!", nomeDoCurso);
    }


}