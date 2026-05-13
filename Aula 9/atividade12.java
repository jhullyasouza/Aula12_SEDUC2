import static java.lang.IO.*;

void main() {
    println("***Calculador de Média Final****");

    // Usando o readln() direto e convertendo para double
    double n1 = Double.parseDouble(readln("Digite sua nota do primeiro bimestre: "));
    double n2 = Double.parseDouble(readln("Digite sua nota do segundo bimestre:  "));
    double n3 = Double.parseDouble(readln("Digite sua nota do terceiro bimestre: "));
    double n4 = Double.parseDouble(readln("Digite sua nota do quarto bimestre:   "));

    double media = (n1 + n2 + n3 + n4) / 4;

    String conceito;
    String status;

    if (media >= 9.0) {
        conceito = "A";
        status = "Aprovado";
    } else if (media >= 7.5) {
        conceito = "B";
        status = "Aprovado";
    } else if (media >= 6.0){
        conceito = "C";
        status = "Aprovado";
    } else if (media >= 4.0){
        conceito = "D";
        status = "Reprovado";
    } else {
        conceito = "E";
        status = "Reprovado";
    }

    // Exibindo os resultados de forma simples
    println("Sua média é: " + media);
    println("Conceito é: " + conceito);
    println("Status é: " + status);
}

