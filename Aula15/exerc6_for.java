import static java.lang.IO.*;

void main() {
    // 1. Variáveis para contar os votos
    int votosJoao = 0;
    int votosMaria = 0;
    int votosNulos = 0;

    println("--- ELEIÇÕES ---");
    println("Candidatos: 1 (João) | 2 (Maria)");

    // 2. Coleta de 10 votos
    for (int i = 1; i <= 10; i++) {
        int voto = Integer.parseInt(readln("Eleitor " + i + ", digite o seu voto: "));

        if (voto == 1) {
            votosJoao = votosJoao + 1;
        } else if (voto == 2) {
            votosMaria = votosMaria + 1;
        } else {
            votosNulos = votosNulos + 1;
        }
    }

    // 3. Exibir totais
    println("\n--- RESULTADO FINAL ---");
    println("João: " + votosJoao + " votos");
    println("Maria: " + votosMaria + " votos");
    println("Nulos: " + votosNulos + " votos");

    // 4. Lógica para decidir o vencedor
    if (votosJoao > votosMaria) {
        println("Vencedor: João!");
    } else if (votosMaria > votosJoao) {
        println("Vencedor: Maria!");
    } else {
        println("Resultado: Empate entre os candidatos!");
    }
}
