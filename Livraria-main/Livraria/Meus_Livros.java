import java.util.ArrayList;
import java.util.Scanner; 

public class Meus_Livros{

    View view;

ArrayList<Livros_Romance> Livros_Romance;
ArrayList<Livros_Acao> Livros_Acao;  

Scanner sc = new Scanner (System.in);



public void cadastar_LivrosRomance (){
   
    this.view.cadastar_LivrosRomance();
    System.out.println("Informe o título do livro de romance:");
    
    Livros_Romance novoLivro = new Livros_Romance();

    String  titulo = sc.nextLine();

    Livros_Romance.add(novoLivro);

    



   

    System.out.println("Livro cadastrado com sucesso!");

  
}









public void imprimir_Enum(){

    for (Genero genero : Genero.values()){

        System.out.println("\nLivro Favorito:\n");

        System.out.println("Genero:" + genero.name());
        System.out.println("Favorito:" + genero.getFavorito());
        System.out.println("Nota:" + genero.getNota());

    }

    

}

public static void main(String[] args) {
//Meus_Livros.imprimir_Enum();

Meus_Livros ml = new Meus_Livros();
ml.imprimir_Enum();
    
   
    
    
    
}



}
