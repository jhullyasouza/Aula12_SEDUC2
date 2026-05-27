import static java.lang.IO.*;

void main() {

    int varA = Integer.parseInt(readln("Digite um número: "));
    int varB = Integer.parseInt(readln("Digite outro número: "));

//   int varC = Integer.parseInt(readln("Digite outro númuro"));

    if(varA > varB) {
        IO.println(varA + " - " + varB + " = " + (varA - varB));
    } else if (varB > varA) {
        IO.println(varB + " - " + varA + " = " + (varB - varA));
    } else {
        IO.println(varB + " = " + varA);
    }

}