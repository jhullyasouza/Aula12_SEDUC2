import java.util.Scanner;

void main() {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Em que turno você estuda?");
    System.out.println("M - Matutino");
    System.out.println("V - Vespertino");
    System.out.println("N - Noturno");
    System.out.print("Digite a opção (MAIÚSCULA): ");

    char turno = leitor.next().charAt(0);

    switch (turno) {
        case 'M':
            System.out.println("Bom Dia!");
            break;
        case 'V':
            System.out.println("Boa Tarde!");
            break;
        case 'N':
            System.out.println("Boa Noite!");
            break;
        default:
            System.out.println("Valor Inválido!");
            break;
    }

    leitor.close();
}

