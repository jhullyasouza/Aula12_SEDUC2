import java.util.Scanner;

void main() {
    Locale.setDefault(Locale.US);
    Scanner leitor = new Scanner(System.in);

    System.out.println("--- Verificador de Triângulos ---");
    System.out.print("Digite o lado A: ");
    double a = leitor.nextDouble();
    System.out.print("Digite o lado B: ");
    double b = leitor.nextDouble();
    System.out.print("Digite o lado C: ");
    double c = leitor.nextDouble();

    // 2. Verificação da existência do triângulo
    if ((a + b > c) && (a + c > b) && (b + c > a)) {

        // 3. Classificação do tipo de triângulo
        if (a == b && b == c) {
            System.out.println("É um Triângulo Equilátero (3 lados iguais).");
        }
        else if (a != b && b != c && a != c) {
            System.out.println("É um Triângulo Escaleno (3 lados diferentes).");
        }
        else {
            System.out.println("É um Triângulo Isósceles (2 lados iguais).");
        }

    } else {
        // Caso a condição de existência falhe
        System.out.println("Os valores informados NÃO podem formar um triângulo.");
    }

    leitor.close();
}
