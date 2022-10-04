package aula1;

import java.io.IOException;

public class AppPessoa  {
    
    public static void limparTela() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

public static void main(String[] args) throws Exception {

    limparTela();

    Pessoa p1 = new Pessoa();
    Pessoa p2 = new Pessoa();

    p1.nome = "Filipi";
    p1.idade = 22;
    p1.mostrarDados();
   // System.out.println("Nome " + p1.nome + " idade " + p1.idade);

    p2.nome = "joao";
    p2.idade = 21;

    p2.mostrarDados();
   // System.out.println("Nome " + p2.nome + " idade " + p2.idade);

   Pessoa p3 = new Pessoa();
   p3.mostrarDados();

   Pessoa p4 = new Pessoa("julia", 19);
   p4.mostrarDados();
}
    
}
