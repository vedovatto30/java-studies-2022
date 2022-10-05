package relacionamento.composicao.curso;

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

        curso2.adicionarAluno(aluno3);

        for(Aluno aluno: curso1.alunos){ //buscar todos os alunos do curso 1
            System.out.println("Estou matriculado no curso 1...");
            System.out.println("E meu nome e " + aluno.nome);
            System.out.println();
        }

    }
}
