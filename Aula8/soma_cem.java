import static java.lang.IO.*;

void main() {

    int varA = Integer.parseInt(readln("Digite um número: "));
    int varB = Integer.parseInt(readln("Digite um segundo número: "));
    int varC = Integer.parseInt(readln("Digite um terceiro número: "));

    int soma = varA + varB + varC;
    if(soma >= 100){
        println("Soma = " + soma);
    } else {
        println("A soma é menor que 100!");
    }
       // println("Soma = " + varA + varB + varC);
        //if(varA + varB + varC >= 100)
    }
