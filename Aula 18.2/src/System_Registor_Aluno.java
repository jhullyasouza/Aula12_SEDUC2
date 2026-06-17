import static java.lang.IO.*;

void main() {

    String[] nomes = new String[10];
    String[] idades = new String[10];
    String[] cursos = new String[10];

    int totalAlunos = 0;
    int opcao = 0;

    while (opcao != 5) {

        println("\n===== SISTEMA DE CADASTRO DE ALUNOS =====");
        println("1 - Cadastrar aluno");
        println("2 - Listar alunos");
        println("3 - Buscar aluno pelo nome");
        println("4 - Remover aluno");
        println("5 - Sair");

        opcao = Integer.parseInt(readln("Escolha uma opção: "));

        if (opcao == 1) {

            if (totalAlunos >= 10) {

                println("Limite de alunos atingido.");

            } else {

                String nome = readln("Nome: ");

                if (nome.isBlank()) {

                    println("ERRO: o nome do aluno não pode ficar vazio.");

                } else {

                    String idade = readln("Idade: ");

                    // Agora o usuário digita o nome do curso diretamente, sem opções engessadas
                    String curso = readln("Curso: ");

                    nomes[totalAlunos] = nome;
                    idades[totalAlunos] = idade;
                    cursos[totalAlunos] = curso;

                    totalAlunos++;

                    println("Aluno cadastrado com sucesso.");
                }
            }

        } else if (opcao == 2) {

            if (totalAlunos == 0) {

                println("Nenhum aluno cadastrado.");

            } else {

                println("\n===== LISTA DE ALUNOS =====");

                for (int i = 0; i < totalAlunos; i++) {

                    println("\nAluno " + (i + 1));
                    println("Nome: " + nomes[i]);
                    println("Idade: " + idades[i]);
                    println("Curso: " + cursos[i]);
                }
            }

        } else if (opcao == 3) {

            String nomeBusca = readln("Digite o nome do aluno: ");

            boolean encontrado = false;

            for (int i = 0; i < totalAlunos; i++) {

                if (nomes[i].equalsIgnoreCase(nomeBusca)) {

                    println("\nAluno encontrado!");
                    println("Nome: " + nomes[i]);
                    println("Idade: " + idades[i]);
                    println("Curso: " + cursos[i]);

                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                println("Aluno não encontrado.");
            }

        } else if (opcao == 4) {

            String nomeRemover = readln("Digite o nome do aluno que deseja remover: ");

            int posicao = -1;

            for (int i = 0; i < totalAlunos; i++) {

                if (nomes[i].equalsIgnoreCase(nomeRemover)) {
                    posicao = i;
                    break;
                }
            }

            if (posicao == -1) {

                println("Aluno não encontrado.");

            } else {

                String resposta = readln("Deseja realmente remover este aluno? (Sim / Não): ");

                if (resposta.equalsIgnoreCase("Sim")) {

                    for (int i = posicao; i < totalAlunos - 1; i++) {

                        nomes[i] = nomes[i + 1];
                        idades[i] = idades[i + 1];
                        cursos[i] = cursos[i + 1];
                    }

                    totalAlunos--;

                    println("Aluno removido com sucesso.");

                } else {

                    println("Remoção cancelada.");
                }
            }

        } else if (opcao == 5) {

            println("Sistema encerrado.");

        } else {

            println("Opção inválida.");
        }
    }

}