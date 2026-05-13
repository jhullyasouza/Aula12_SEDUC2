//exerc5_for
import static java.lang.IO.*;

void main() {
//
//    float soma = 0F;
//    float media = 0F;
//
//    for(int i = 1; i <= 10; i++){
//        int num = Integer.parseInt(readln("Digite um número; "));
//        println("Número = " + num);
//        soma = soma + num;
//    }
//    media = soma / 10;
//    println("Soma = " + soma);
//    println("Média = " + media);


    float soma = 0F;
    float media = 0F;

    // Iniciamos apenas declarando as
    // variáveis
    int maior = 0; //Integer.MIX_VALUE;
    int menor = 0; //Integer.MIN_VALUE;

    int somaPares = 0;
    int somaImpares = 0;
    int qtdPares = 0;
    int qtdImpares = 0;

    for(int i = 1; i <= 10; i++){

        int num = Integer.parseInt(readln("Digite um numero:"));

        soma = soma + num;

        if (i == 1) {
            maior = num;
            menor = num;
        } else {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        if (num % 2 == 0) {
            //somaPares = somaPares + num;
            somaPares += num;
            qtdPares++;
        } else {
            //somaImpares = somaImpares + num;
            somaImpares += num;
            qtdImpares++;
        }
    }

    media = soma / 10;

    println("\n--- RESULTADOS ---");
    println("Soma de todos: " + soma);
    println("Media: " + media);
    println("Maior numero: " + maior);
    println("Menor numero: " + menor);
    println("Soma dos pares: " + somaPares);
    println("Soma dos impares: " + somaImpares);
    println("Quantidade de pares: " + qtdPares);
    println("Quantidade de impares: " + qtdImpares);
}