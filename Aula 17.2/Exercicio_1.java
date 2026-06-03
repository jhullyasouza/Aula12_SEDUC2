import static java.lang.IO.*;

void main() {

    String produtos[] = new String[5];//

    for (int i = 0; i <= 5; i++) {
        produtos[i] = readln("Digite o nome do produto: ");
    }
    println("-----------------------------------------------");
    for (int i = 0; i <= 5; i++)
        println("Os produtos são: " + produtos[i]);

}
    
