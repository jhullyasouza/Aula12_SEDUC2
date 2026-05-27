import static java.lang.IO.*;

void main() {
    IO.println("Digite um número inteiro: ");
    int num = Integer.parseInt(readln());

    if(num % 2 == 0) {
        IO.println("número é par!");
    } else {
        IO.println("Número é ímpar!");
    }

}