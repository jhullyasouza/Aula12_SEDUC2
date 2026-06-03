import static java.lang.IO.*;

void main() {

    String nome = "Jhullya";

    println("\n -- Imprimindo o conteúdo de uma variavel");
    println("nome: " + nome);

    String[] nomes = {"Anderson", "Atila", "Mathias", "Lucas"};
    println("\n -- Imprimindo o conteúdo de de um ARRAY");

    println("Nome: " + nomes[0]);
    println("Nome: " + nomes[1]);
    println("Nome: " + nomes[2]);
    println("Nome: " + nomes[3]);

    println("\n -- Imprimindo o conteúdo de de um ARRAY com um LOOP FOR");

    for(int i = 0 ; i <= 4; i++){
        IO.println("Nome: " + nomes[i]);
    }

    String[] carros = new String[4]; //


// DESAFIO: peça para o usuario digitar 4 carros em seguida e grave-os no Array criado acima
// Ao final, imprima a lista de carros com a numeracao de 1 a 4
    println("\n*** CADASTRO DE CARROS***\n");
    carros[0] = readln("Digite o carro 1: ");
    carros[1] = readln("Digite o carro 2: ");
    carros[2] = readln("Digite o carro 3: ");
    carros[3] = readln("Digite o carro 4: ");

    println("\nO carro 1 é o : " + carros[0]);
    println("O carro 2 é o : " + carros[1]);
    println("O carro 3 é o : " + carros[2]);
    println("O carro 4 é o : " + carros[3]);





}