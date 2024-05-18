package br.up.edu.Controle;


import java.util.Random;

import br.up.edu.Modelo.Aluno;
import br.up.edu.Modelo.Disciplina;
import br.up.edu.Modelo.Professor;

public class Controle {

    private static Random random = new Random();

    private static Disciplina Disciplina = new Disciplina();

    public static void CriarDisciplina(Disciplina disciplina){

        disciplina.setId(random.nextInt());

        Disciplina = disciplina;

    }
    
    public static void AdicionarProfessor(Professor professor){

        Professor professores[] =  Disciplina.getProfessores();

        for (int i = 0; i < professores.length; i++) {
            
            if (professores[i] == null) {
                
                professores[i] = professor;

            }

        }      
        
        Disciplina.setProfessores(professores);
    }

    public static void AdicionarAluno(Aluno aluno){

        Aluno alunos[] =  Disciplina.getAlunos();

        for (int i = 0; i < alunos.length; i++) {
            
            if (alunos[i] == null) {
                
                alunos[i] = aluno;

            }
        
        Disciplina.setAlunos(alunos);

        }        
    }

    public static void VerificarSituacaoAluno(Aluno aluno){

        for (Aluno alunos : Disciplina.getAlunos()) {

            if(alunos.equals(aluno)){

                if(aluno.getIsMateriaCompleta() && Disciplina.getCompetencia().equalsIgnoreCase("Necessario")){

                    System.out.println(String.format("ALuno: %s Aprovado", aluno.getNome()));

                }
                else if((!aluno.getIsMateriaCompleta()) && Disciplina.getCompetencia().equalsIgnoreCase("Complementar")){

                    System.out.println(String.format("ALuno: %s Aprovado", aluno.getNome()));


                }else if((!aluno.getIsMateriaCompleta()) && Disciplina.getCompetencia().equalsIgnoreCase("Necessario")){

                    System.out.println(String.format("ALuno: %s Reprovado", aluno.getNome()));


                }
                
            }

        }

    }


    
    

}
