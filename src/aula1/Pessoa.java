package aula1;

public class Pessoa {
    public String nome;
    public int idade;
    private double salario;

   public void mostrarDados(){
        System.out.println("Nome " + this.nome + " idade " + this.idade + " e seu  salario é " + this.salario);
    }

   public Pessoa() {
        this.nome = "sem nome";
        this.idade = 0;
        this.salario = 1000;
    }
   public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
}

