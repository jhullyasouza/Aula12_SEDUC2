import java.util.Scanner;
import java.util.Locale;

void main() {
    Locale.setDefault(Locale.US);
    Scanner leitor = new Scanner(System.in);

    System.out.println("--- SUPER CALCULADORA ---");
    System.out.println("1 - Adição       2 - Subtração");
    System.out.println("3 - Multiplicação 4 - Divisão");
    System.out.println("5 - Potência     6 - Raiz Quadrada");
    System.out.println("7 - Número Par   8 - Número Ímpar");
    System.out.print("\nEscolha uma operação: ");
    int opcao = leitor.nextInt();

    // 2. Entrada do primeiro número (comum a todas as operações)
    System.out.print("Digite o número (ou o primeiro número): ");
    double n1 = leitor.nextDouble();

    // 3. Processamento das Operações
    switch (opcao) {
        case 1: // Adição
            System.out.print("Digite o segundo número: ");
            double n2_soma = leitor.nextDouble();
            System.out.printf("Resultado: %.2f + %.2f = %.2f%n", n1, n2_soma, (n1 + n2_soma));
            break;

        case 2: // Subtração
            System.out.print("Digite o segundo número: ");
            double n2_sub = leitor.nextDouble();
            System.out.printf("Resultado: %.2f - %.2f = %.2f%n", n1, n2_sub, (n1 - n2_sub));
            break;

        case 3: // Multiplicação
            System.out.print("Digite o segundo número: ");
            double n2_mult = leitor.nextDouble();
            System.out.printf("Resultado: %.2f * %.2f = %.2f%n", n1, n2_mult, (n1 * n2_mult));
            break;

        case 4: // Divisão
            System.out.print("Digite o segundo número: ");
            double n2_div = leitor.nextDouble();
            if (n2_div != 0) {
                System.out.printf("Resultado: %.2f / %.2f = %.2f%n", n1, n2_div, (n1 / n2_div));
            } else {
                System.out.println("Erro: Não é possível dividir por zero!");
            }
            break;

        case 5: // Potência
            System.out.print("Digite o expoente: ");
            double exp = leitor.nextDouble();
            System.out.printf("Resultado: %.2f elevado a %.2f = %.2f%n", n1, exp, Math.pow(n1, exp));
            break;

        case 6: // Raiz Quadrada
            if (n1 >= 0) {
                System.out.printf("A raiz quadrada de %.2f é %.2f%n", n1, Math.sqrt(n1));
            } else {
                System.out.println("Erro: Não existe raiz quadrada real de número negativo!");
            }
            break;

        case 7: // Par
            if (n1 % 2 == 0) {
                System.out.println(n1 + " é um número PAR.");
            } else {
                System.out.println(n1 + " NÃO é um número PAR.");
            }
            break;

        case 8: // Ímpar
            if (n1 % 2 != 0) {
                System.out.println(n1 + " é um número ÍMPAR.");
            } else {
                System.out.println(n1 + " NÃO é um número ÍMPAR.");
            }
            break;

        default:
            System.out.println("Opção inválida!");
            break;
    }

    System.out.println("\nCalculadora encerrada.");
    leitor.close();
}

