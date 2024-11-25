public class Nadador {
    String nome;
    int idade;

// Construtor da classe Nadador
public Nadador(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
}

// Método para exibir as informações do nadador
public void mostrarInfo() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
}

public static void main(String[] args) {
    // Criando um objeto da classe Nadador e definindo os atributos
    Nadador nadador1 = new Nadador("Bianca", 21);

    // Exibindo as informações do nadador
    nadador1.mostrarInfo();
}
}