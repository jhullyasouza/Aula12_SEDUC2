import static java.lang.IO.*;

void main() {
    println("*** Calculador de Reajuste Salarial ***");

    // Lendo o salário atual do funcionário
    double salarioAtual = Double.parseDouble(readln("Digite o salário atual do funcionário: R$ "));

    // Variáveis para guardar o percentual e o valor do aumento
    int percentual = 0;
    double valorAumento = 0;

    // Estrutura de decisão para aplicar as regras do critério
    if (salarioAtual <= 1000.00) {
        percentual = 20;
    } else if (salarioAtual <= 1700.00) {
        percentual = 15;
    } else if (salarioAtual <= 2300.00) {
        percentual = 10;
    } else {
        percentual = 5;
    }

    // Calculando o valor do aumento e o novo salário
    valorAumento = salarioAtual * (percentual / 100.0);
    double novoSalario = salarioAtual + valorAumento;

    // Exibindo os resultados na tela
    println("\n--- RESULTADO DO REAJUSTE ---");
    println("Salário antes do reajuste : R$ " + salarioAtual);
    println("Percentual de aumento     : " + percentual + "%");
    println("Valor do aumento          : R$ " + valorAumento);
    println("Novo salário, após aumento: R$ " + novoSalario);
}