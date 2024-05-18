package br.up.edu.Tela;
import java.util.Scanner;
import br.up.edu.Controle.Controle;
import br.up.edu.Modelo.Aluno;
import br.up.edu.Modelo.Disciplina;
import br.up.edu.Modelo.Professor;
import br.up.edu.Modelo.Titulacao;

public class Tela {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void exibirMenu() {
        boolean sair = false;

        while (!sair) {
            System.out.println("===== MENU =====");
            System.out.println("1. Adicionar Professor");
            System.out.println("2. Adicionar Aluno");
            System.out.println("3. Adicionar Disciplina");
            System.out.println("4. Verificar Situação do Aluno");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

        scanner.nextLine();
        System.out.println("Informe o nome: ");
        var Nome = scanner.nextLine();
        System.out.println("Informe o RG: ");
        var Rg = scanner.nextLine();
        System.out.println("Informe o numero da matricula: ");
        var Matricula = scanner.nextLine();
        System.out.println("Informe o numero do Curriculo Lattes: ");
        var Curriculo = scanner.nextLine();

        var titulacao = Titulacao.GerarTitulacao();

        var Professor = new Professor(Nome,Rg,Matricula,Curriculo,titulacao);

        Controle.AdicionarProfessor(Professor);
                
                    break;
                case 2:
               
                scanner.nextLine();
                System.out.println("Informe o nome: ");
                var NomeAluno = scanner.nextLine();
                System.out.println("Informe o RG: ");
                var RgAluno = scanner.nextLine();
                System.out.println("Informe o numero da matricula: ");
                var MatriculaAluno = scanner.nextLine();
                System.out.println("Informe o ano de ingressao: ");
                var AnoAluno = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Informe o Nome do Curso:  ");
                var CursoAluno = scanner.nextLine();
                System.out.println("Informe o Turno: ");
                var Turno = scanner.nextLine();

                var aluno = new Aluno(NomeAluno, RgAluno,MatriculaAluno,AnoAluno,CursoAluno,Turno);

                aluno.VerificarSituacaoMateria();

                Controle.AdicionarAluno(aluno);
                
                break;

            case 3:

        scanner.nextLine();
        
        System.out.println("Informe o nivel da compentencia 1(Complementar) ou 2(Necessario)");
        
        String Comp = scanner.nextInt() == 1 ? "Complementar" : "Necessario";

        scanner.nextLine();
        System.out.println("Informe o nome da Disciplina: ");
        var NomeDisciplina = scanner.nextLine();
        System.out.println("Informe o curriculo: ");
        var CurriculoDisciplina = scanner.nextLine();

        Disciplina disciplina = new Disciplina(Comp,NomeDisciplina,CurriculoDisciplina);

        Controle.CriarDisciplina(disciplina);

            break;

        case 4:

        scanner.nextLine();
        System.out.println("Informe o nome: ");
        var NomeConsl = scanner.nextLine();
        System.out.println("Informe o RG: ");
        var RgConsl = scanner.nextLine();
        System.out.println("Informe o numero da matricula: ");
        var MatriculaConsl = scanner.nextLine();

        Aluno AlunoConsl = new Aluno(NomeConsl, RgConsl,MatriculaConsl);

        Controle.VerificarSituacaoAluno(AlunoConsl);
                
        break;
                
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    
}
