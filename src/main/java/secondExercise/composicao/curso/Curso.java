package secondExercise.composicao.curso;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    // Um Curso contem um Nome e uma lista de Alunos
   final String nome;
   final  List<Aluno> alunos = new ArrayList<>(); // Lista Final ou Constante, quer dizer que o endereço na memoria
    //referente a lista será sempre a mesma. Os elementos dentro da lista poderão ser alterados normalmente

    Curso(String nome){
        this.nome = nome;
    }

    //metodo para adicionar aluno
   void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno); //é possivel adicionar um aluno na lista de alunos
        aluno.cursos.add(this); // e adicionar um aluno dentro de cursos
    }

}
