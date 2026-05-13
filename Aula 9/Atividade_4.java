import java.util.Scanner;
void main() {
    //Entrada
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite um número de 1 a 7: ");
    int numero = leitor.nextInt();

    switch (numero) {
        case 1:
            System.out.println("Domingo");
            break;

        case 2:
            System.out.println("Segunda");
            break;

        case 3:
            System.out.println("Teça");
            break;

        case 4:
            System.out.println("Quarta");
            break;

        case 5:
            System.out.println("Quinta");
            break;

        case 6:
            System.out.println("Sexta");
            break;

        case 7:
            System.out.println("Sábado");
            break;
        default:
            System.out.println("Opção Inválida!");
            break;
    }
    leitor.close();
}