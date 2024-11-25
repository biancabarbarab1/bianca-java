

public class Nadador1 {
    String nome;
    int idade;
    
    public Nadador1 (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getidade() {
        return idade;
    } 

    public static void main(String[]args) {
        Nadador1 Nadador = new Nadador1("bianca", 21);
    }
}
        
