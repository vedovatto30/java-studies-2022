package relacionamento.composicao.curso;

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
}
