package secondExercise.composicao.curso;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    // Um aluno tem um Nome e uma Lista de cursos

    final String nome;
    List<Curso> cursos = new ArrayList<>();

    //construtor
    Aluno(String nome){
        this.nome = nome;
    }


    //metodo adicionar Curso
    void adicionarCursos(Curso curso){ // vai receber um curso
        this.cursos.add(curso); //adicionar um curso
        curso.alunos.add(this); //adicionar lista de alunos no curso
    }
        Curso obterCursoPorNome(String nome){


            for(Curso curso : this.cursos){ //metodo para realizar a pesquisa do curso pelo nome
                if(curso.nome.equalsIgnoreCase(nome)){
                    return curso;
                }
            }
            //se não retornar nada, retorna nulo
            return null;
        }
    public String toString(){  // metodo para retornar o string no main ao inserir "System.out.println(aluno1.cursos.get(0).alunos);"
    // a forma que retornar no toString sera a forma que o objeto retornara no main
        return nome;
    }
}
