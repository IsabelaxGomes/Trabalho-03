import java.util.Scanner;
import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;

public class Livros_Lido {

 

    public static void main(String[] args) {

        //Criando o arquivo
        try{

            File arq = new File("meus_livros.dat");

            boolean nao_existe = arq.createNewFile();

            if(nao_existe){
                System.out.println("Arquivo criado");
            }else{
                System.out.println("Já existe");
            }

        
            //Escrevendo no arquivo 

        FileWriter fw = new FileWriter("meus_livros.dat", true);

        String livro1 = "\n01 - A Cabana";
        String livro2 = "\n02 - Para todos os garotos que já amei";
        String livro3 = "\n03 - Cristianismo puro e simples";
        String livro4 = "\n04 - Enraizando";
        String livro5 = "\n05 - Esconda-se";

        fw.write(livro1);
        fw.write(livro2);
        fw.write(livro3);
        fw.write(livro4);
        fw.write(livro5);

        fw.close();


        

       
    }catch(Exception e){
        e.printStackTrace();
    }


}
}
