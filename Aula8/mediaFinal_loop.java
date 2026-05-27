import static java.lang.IO.*;

void main() {
    int alunos = 1;
    while (alunos <= 4)
    {
        IO.println("digite o nome do " + alunos + " ° aluno: ");
        String nome = readln();

        float soma_notas = 0;
        int notas = 1;
        while (notas <=4){

            IO.println("\nDigite a " + notas + " °nota: ");
            Float nb = Float.parseFloat(readln());
            soma_notas = soma_notas + nb;
            notas = notas +1;
        }
        float media = soma_notas / 4;
        alunos = alunos +1;
        if (media >=7){
            IO.println("Media= " + media + ", Situação = Aprovado\n");

        }else if (media < 5) {
            IO.println("Media= " + media + ", Situação = Reprovado\n");
        } else {
            IO.println("Media= " + media + ", Situação = Recuperção\n");
        }}

}


