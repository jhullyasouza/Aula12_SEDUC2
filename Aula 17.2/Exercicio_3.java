import static java.lang.IO.*;

void main() {

    String[] nomes = new String[5];
    int encontrado = 0;
    for(int i = 0; i < 5; i++) {
        nomes[i] = readln("Digite o nome: ");
    }

    String procura_nome = readln("digite o nome para pesquisar: ");

    for(int i = 0; i < 5; i++) {
        if (nomes[i].equals(procura_nome)) {
            encontrado = 1;
        }
    }
    if (encontrado == 1){
        println("O nome foi encontrado!");
    }else{
        println("O nome não foi encontrado.");
    }
}

