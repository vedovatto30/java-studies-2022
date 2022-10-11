package secondExercise.composicao.curso;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno( "Joao");
        Aluno aluno2 = new Aluno( "Pedro");
        Aluno aluno3 = new Aluno( "Jose");
        Aluno aluno4 = new Aluno( "Francisco");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Spring");
        Curso curso3 = new Curso("Jpa");

        //relacionamento dos objetos

        aluno1.adicionarCursos(curso1);
        aluno2.adicionarCursos(curso2);
        aluno1.adicionarCursos(curso3);
        aluno2.adicionarCursos(curso3);
        aluno4.adicionarCursos(curso3);

        curso2.adicionarAluno(aluno3);

        for(Aluno aluno: curso1.alunos){ //buscar todos os alunos do curso 1
            System.out.println("Estou matriculado no curso - " + curso1.nome + ":");
            System.out.println("E meu nome e " + aluno.nome);
            System.out.println();
        }

        for(Aluno aluno: curso3.alunos){ //buscar todos os alunos do curso 3
            System.out.println("Estou matriculado no curso - " + curso3.nome + ":");
            System.out.println("E meu nome e " + aluno.nome);
            System.out.println();
        }

        System.out.println(aluno1.cursos.get(0).alunos);

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java");

        if (cursoEncontrado!= null){ //se for diferente de null, ou seja, ele foi encontrado
            System.out.println("Alunos do curso" + cursoEncontrado.alunos);
        }else{
            System.out.println("Curso não cadastrado");
        }

    }
}
