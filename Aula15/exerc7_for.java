import static java.lang.IO.*;

void main() {
    float saldo = 500.00F;
    int opcao = -1;

    println("--- CAIXA ELETRÔNICO SEGURO ---");

    // 2. O Ciclo do Menu
    while (opcao != 0) {
        println("\nSaldo Disponível: R$ " + saldo);
        println("1. Saque");
        println("2. Depósito");
        println("3. Ver Saldo");
        println("0. Sair");

        opcao = Integer.parseInt(readln("Escolha uma opção: "));

        // 3. Lógica das Opções com Regras de Negócio
        if (opcao == 1) {
            float valorSaque = Float.parseFloat(readln("Quanto deseja sacar? "));

            // Regra: Valor inválido não permitido (negativo ou zero)
            if (valorSaque <= 0) {
                println("Erro: O valor do saque deve ser maior que zero!");
            }
            // Regra: Não sacar valor maior que o saldo
            else if (valorSaque > saldo) {
                println("Erro: Saldo insuficiente! Você tem apenas R$ " + saldo);
            } else {
                saldo = saldo - valorSaque;
                println("Saque de R$ " + valorSaque + " realizado com sucesso!");
            }

        } else if (opcao == 2) {
            float valorDeposito = Float.parseFloat(readln("Quanto deseja depositar? "));

            // Regra: Valor inválido não permitido
            if (valorDeposito <= 0) {
                println("Erro: O valor do depósito deve ser positivo!");
            } else {
                saldo = saldo + valorDeposito;
                println("Depósito de R$ " + valorDeposito + " realizado!");
            }

        } else if (opcao == 3) {
            println("O seu saldo atual é: R$ " + saldo);

        } else if (opcao == 0) {
            println("Saindo... Obrigado por usar nossos serviços!");

        } else {
            println("Opção inválida! Escolha entre 0, 1, 2 ou 3.");
        }
    }
}








