public class LivroDeNotas{
    
    //variável de instância
    //instância é sinônimo de objeto
    //ela chama variável de instância pois cada instância tem a sua própria cópia dela
    private String nomeCurso;

    //construtor padrão quando a lista de parâmetros é vazia
    public LivroDeNotas (String nomeCurso){
        this.setNomeCurso(nomeCurso);
        // if (nomeCurso.length() >= 10)
        //     this.nomeCurso = nomeCurso;
        //System.out.println("Executando o construtor...");
    }

    //getters e setters
    public void setNomeCurso (String s){
        if (s.length() >= 10)
            this.nomeCurso = s;
    }

    public String getNomeCurso (){
        return this.nomeCurso;
    }

    
    //esse é um método de instância
    public void exibirMensagem (){
        //System.out.println("Bem vindo ao seu livro de notas");
        System.out.printf("Bem vindo ao livro de notas do curso %s!\n", this.getNomeCurso());
    }


}