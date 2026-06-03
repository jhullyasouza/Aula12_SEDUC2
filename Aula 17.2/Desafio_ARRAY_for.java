import static java.lang.IO.*;

void main() {

    String carros[] = new String[110]; //
    for (int i = 0; i <= 100; i++) {
        carros[i] = readln("Digite o nome do carro: ");
    }
    println("-----------------------------------------------");
    for (int i = 0; i <= 100; i++)
        println("Os carros são: " + carros[i]);

}