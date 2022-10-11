package secondExercise.composicao.heranca;

public class Jogo {

    public static void main(String[] args) {
        Vilao monstroY = new Vilao();  // A classe(objeto) Vilao recebe atributos por receber heranca de Jogador
        monstroY.x = 10;
        monstroY.y = 10;

        Heroi heroiX = new Heroi(); // A classe(objeto) Heroi recebe atributos por receber heranca de Jogador
        heroiX.x = 10;
        heroiX.y = 11;


        System.out.println("O Heroi tem de vida: " + monstroY.vida);
        System.out.println("O Heroi tem de vida: " + heroiX.vida);

        monstroY.atacar(heroiX);

        System.out.println("O Heroi tem de vida: " + monstroY.vida);
        System.out.println("O Heroi tem de vida: " + heroiX.vida);
    }
}
