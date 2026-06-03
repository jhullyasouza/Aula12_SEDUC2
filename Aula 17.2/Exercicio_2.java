import static java.lang.IO.*;

void main() {

    double[] notas = new double[4];

    double soma= 0;

    for(int i = 0; i < 4; i++) {

        notas[i] = Double.parseDouble(readln("digite sua nota: "));
    }
    for(int i = 0; i < 4; i++) {
        soma = soma + notas[i];
    }
    double media= soma/4;

    println("Sua média é : " + media);
}




