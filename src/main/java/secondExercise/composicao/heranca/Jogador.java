package secondExercise.composicao.heranca;

public class Jogador {

    // Caso deseje criar um metodo para movimentar algo, é possivel criar um ENUM e enumerar os parametros
    // assim utilizando dentro dos metodos criados e das ações apresentadas pelo usuario

    int x;
    int y;

    int xx;

    int yy;
    int vida = 100;

    boolean atacar(Jogador oponente) {

        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        } else {

            return true;
        }
    }

    boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE:
                y--;
                break;
            case SUL:
                y++;
                break;
            case LESTE:
                x++;
                break;
            case OESTE:
                x--;
                break;
        }
        return true;

        /*

        Ou utilizando o if

        if(direcao == Direcao.NORTE){
            y++;
        }  if(direcao == Direcao.SUL){
            x++;
        }  if(direcao == Direcao.LESTE){
            xx++;
        }  if(direcao == Direcao.OESTE){
            yy++;
        }
        return true;

    */


    }
}
