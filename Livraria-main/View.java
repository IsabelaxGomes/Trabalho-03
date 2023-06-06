import java.util.Scanner;

public class View {

    Scanner sc = new Scanner (System.in);
    //Faz o cadastro de um novo livro 

    public void cadastar_LivrosRomance(){
        System.out.println("Informe o nome do Livro para ser Cadastrado:");
    }

    public String lerNoome(){
        return sc.nextLine();
    }
    
}
