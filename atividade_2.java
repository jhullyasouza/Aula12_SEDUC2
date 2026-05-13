import java.util.Scanner;

void main() {
    Scanner leitor = new Scanner(System.in);

    //Entrada e processmento
    double consumo;
    double valorTotal;

    System.out.println("Digite o consumo da residência normal (m3): ");
    consumo = leitor.nextDouble();

    if (consumo <= 10) {
        valorTotal = 22.38;
    } else if (consumo <= 20) {
        valorTotal = consumo * 3.50;
    } else if (consumo <= 50) {
        valorTotal = consumo * 8.75;
    } else {
        valorTotal = consumo * 9.64;
    }

    //Saída
    System.out.printf("---Fatura Residência---");
    System.out.printf("Consumo registrado: %.2f m3%n", consumo);
    System.out.printf("Valor a pagar: R$ %.2f m3$n", valorTotal);

    leitor.close();

}