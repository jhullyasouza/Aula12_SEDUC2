import static java.lang.IO.*;

void main() {
    int soma = 0;

    println("Calculando a soma dos múltiplos de 3 entre 1 e 100...");

    // 2. Ciclo que vai de 1 até 100
    for (int i = 1; i <= 100; i++) {

        // 3. Verifica se o número atual (i) é múltiplo de 3
        if (i % 3 == 0) {
            println("Múltiplo encontrado: " + i);
            soma = soma + i; // Adiciona o número ao total acumulado
        }
    }

    // 4. Exibe o resultado final
    println("---------------------------------------");
    println("A soma total de todos os múltiplos é: " + soma);
}