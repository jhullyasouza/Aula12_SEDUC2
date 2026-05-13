import static java.lang.IO.*;

void main() {

    int senhaCorreta = 4321;
    int tentativasUsadas = 0;
    boolean acertou = false;

    println("--- SEGURANÇA DO CAIXA ---");

    for (int i = 1; i <= 3; i++) {
        int senhaDigitada = Integer.parseInt(readln("Digite sua senha (Tentativa " + i + " de 3): "));

        if (senhaDigitada == senhaCorreta) {
            println("Acesso concedido! Bem-vindo.");
            acertou = true;
            break; // Sai do laço 'for' na hora, pois já acertou
        } else {
            tentativasUsadas = i;
            if (i < 3) {
                println("Senha incorreta! Tente novamente.");
            }
        }
    }

    if (!acertou) {
        println("\nERRO: Senha errada 3 vezes.");
        println("SUA CONTA FOI BLOQUEADA POR SEGURANÇA!");
    }

}