import static java.lang.IO.*;

void main() {
    int via = Integer.parseInt(readln("Digite a velocidade da via: "));
    int vl = Integer.parseInt(readln("Digite a velocidade: "));

    if( vl <= via ){
        IO.println("Sem multa");
    } else if ( vl <= via + 20) {
        IO.println("Multa Leve!");
    } else {
        IO.println("Multa Grave!");
    }

}