import static java.lang.IO.*;

void main() {
    int varA = Integer.parseInt(readln("Digite um número de 1 a 9: "));

    if(varA >= 9){
        IO.println("O valor está fora da faixa permitida!");
    } else if (varA < 1){
        IO.println("O valor está fora da faixa permitida!");
    } else {
        IO.println("O valor está dentro da faixa permitida!");
    }

    //if(num >= 1 &&  =<9){
    //print(" O valor está na faixa permitida");
    //else{
    //IO.println("O valor está fora da faixa permitidade")

}