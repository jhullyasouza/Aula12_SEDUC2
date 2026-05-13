import static java.lang.IO.*;

void main() {
    float totalCompra = 0F;
    float valorProduto = -1F; // Começa com -1 para entrar no loop

    println("--- CAIXA DA LOJA ---");
    println("Instrução: Digite o valor do produto ou '0' para encerrar.\n");

    while (valorProduto != 0) {
        valorProduto = Float.parseFloat(readln("Valor do produto: R$ "));

        if (valorProduto > 0) {
            totalCompra = totalCompra + valorProduto;
            println("Subtotal: R$ " + totalCompra);
        }
        else if (valorProduto < 0) {
            println("Erro: Valor inválido! Por favor, digite valores positivos.");
        }
    }

    println("----------------------------------");
    println("COMPRA FINALIZADA!");
    println("O valor total a pagar é: R$ " + totalCompra);
    println("----------------------------------");
}

