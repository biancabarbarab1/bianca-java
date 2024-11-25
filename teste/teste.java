public class Carro {
    //Atributos do carro
    String marca; 
    String modelo; 
    String cor;
    //Método do carro
    void acelerar() {
        System.out.println("O carro está acelerando.");
    }
    void frear() {
        System.out.println("O carro está freando.");
    }
    void virar(String direcao) {
        System.out.println("O carro está virando para direção " + direcao + ".");
    }
    //metodo principal para executar o programa 
    public static void main(String[] args) throws Exception {
        //criação de um ovbjeto do tipo carro
        Carro meuCarro = new Carro();
        meuCarro.marca = "Bmw";
        meuCarro.modelo = "320i";
        meuCarro.cor = "Preto";

        //exibir informações sobre o carro
        System.out.println("Meu carro "+meuCarro.marca+ " "+meuCarro.modelo+" de cor "+meuCarro.cor+" ");

        //chamando os metodos do objeto
        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.virar("direita");
    
    }
}
