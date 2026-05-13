import java.util.Scanner;

void main() {
    Locale.setDefault(Locale.US);
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite o Salário Bruto (R$): ");
    double salarioBruto = leitor.nextDouble();

    double descontoINSS = 0;
    double descontoIRRF = 0;

    if (salarioBruto <= 1302.00) {
        descontoINSS = salarioBruto * 0.075;
    } else if (salarioBruto <= 2571.29) {
        descontoINSS = salarioBruto * 0.09;
    } else if (salarioBruto <= 3856.94) {
        descontoINSS = salarioBruto * 0.12;
    } else {
        descontoINSS = salarioBruto * 0.14;
    }

    double baseIRRF = salarioBruto - descontoINSS;

    if (baseIRRF <= 1903.98) {
        descontoIRRF = 0;
    } else if (baseIRRF <= 2826.65) {
        descontoIRRF = baseIRRF * 0.075;
    } else if (baseIRRF <= 3751.05) {
        descontoIRRF = baseIRRF * 0.15;
    } else if (baseIRRF <= 4664.68) {
        descontoIRRF = baseIRRF * 0.225;
    } else {
        descontoIRRF = baseIRRF * 0.275;
    }

    double salarioLiquido = salarioBruto - descontoINSS - descontoIRRF;

    System.out.println("\n--- DETALHAMENTO DA FOLHA ---");
    System.out.printf("Salário Bruto  : R$ %.2f%n", salarioBruto);
    System.out.printf("Desconto INSS  : R$ %.2f%n", descontoINSS);
    System.out.printf("Desconto IRRF  : R$ %.2f%n", descontoIRRF);
    System.out.println("-----------------------------");
    System.out.printf("SALÁRIO LÍQUIDO: R$ %.2f%n", salarioLiquido);

    leitor.close();
}


