import static java.lang.IO.*;

void main() {

    String senha = "4321";
    String msg = ""; //String nula

    int tentativas = 1; //valor inicial do loop
    while(tentativas <= 3) //valor final do loop
    {
        IO.println("Digite uma senha!");
        String senha_fornecida = readln();

        if(senha_fornecida.equals(senha)){
            msg = (" Liberado! ");
            break;
        } else {
            msg = (" Negado! ");
        }
    }
    IO.println("Acesso: " + msg);
    IO.println("Fim do Programa!");
}
