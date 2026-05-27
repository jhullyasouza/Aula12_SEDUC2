import static java.lang.IO.*;

void main() {

    String senha = "4321";
    String msg = "";

    for(int tentativas = 1; tentativas <= 3; tentativas++)
    {
        IO.println("Digite uma senha!");
        String senha_fornecida = readln();
       // String senha_fornecida = readln("Digite uma senha!: ");

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