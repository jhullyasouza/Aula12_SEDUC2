import static java.lang.IO.*;

void main() {

    int[] numeros = new int[6];

    int numpares = 0;

    for (int i = 0; i < 6; i++) {

        numeros[i] = Integer.parseInt(readln("digite algum valor inteiro: "));
    }

    for (int i = 0; i < 6; i++) {
        if (numeros[i] % 2 == 0) {
            numpares = numpares + 1;
        }
    }
    IO.println("quanntidades de numeros pares: " + numpares);
}

