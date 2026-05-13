import java.util.Scanner;

void main() {
    Locale.setDefault(Locale.US);
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite o seu peso (kg): ");
    double peso = leitor.nextDouble();

    System.out.print("Digite a sua altura (m): ");
    double altura = leitor.nextDouble();

    double imc = peso / (altura * altura);

    String classificacao = "";

    if (imc < 16) {
        classificacao = "Magreza grave";
    } else if (imc < 17) {
        classificacao = "Magreza moderada";
    } else if (imc < 18.5) {
        classificacao = "Magreza leve";
    } else if (imc < 25) {
        classificacao = "Saudável";
    } else if (imc < 30) {
        classificacao = "Sobrepeso";
    } else if (imc < 35) {
        classificacao = "Obesidade Grau I";
    } else if (imc < 40) {
        classificacao = "Obesidade Grau II (severa)";
    } else {
        classificacao = "Obesidade Grau III (mórbida)";
    }

    System.out.println("\n--- RESULTADO ---");
    System.out.printf("Seu IMC é: %.2f%n", imc);
    System.out.println("Classificação: " + classificacao);

    leitor.close();
}

