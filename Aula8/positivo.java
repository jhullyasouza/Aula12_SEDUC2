import static java.lang.IO.*;

void main() {
    int varN = Integer.parseInt(readln("Digite um número: "));

    if(varN > 0){
        IO.println("O número é positivo!");
    } else if (varN < 0){
        IO.println("O número era negativo: " + (varN * -1));
    } else {
        IO.println("Zero é neutro!");
    }

}