import static java.lang.IO.*;

void main() {
    int pl = Integer.parseInt(readln("Digite um número de 0 á 9: "));

    String diaRodizio = switch(pl){
        case 1,2 -> "Segunda-Feira!";
        case 3,4 -> "Terça-Feira!";
        case 5,6 -> "Quarta-Feira!";
        case 7,8 -> "Quinta-Feira!";
        case 9,0 -> "Sexta-Feira!";
        default -> "Placa Invalida!";
    };
    print(diaRodizio);

}
