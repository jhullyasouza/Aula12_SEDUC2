import java.util.Scanner;

void main() {
    Scanner leitor = new Scanner(System.in);

    //Entrada e Processamento
    double consumo;
    double valorTotal;

    System.out.println("Digite o consumo de água em m3: ");
    consumo = leitor.nextDouble();

    if (consumo <= 10) {
        valorTotal = 7.59;
    } else if (consumo <= 20) {
        valorTotal = consumo * 1.31;
    } else if (consumo <= 30) {
        valorTotal = consumo * 4.64;
    } else if (consumo <= 50) {
        valorTotal = consumo * 6.62;
    } else {
        valorTotal = consumo * 7.31;
    }

    //Saída
    System.out.printf("O valor da conta para um consumo de %.2fm3 é: R$ %2f%n", consumo, valorTotal);

    leitor.close();

}
