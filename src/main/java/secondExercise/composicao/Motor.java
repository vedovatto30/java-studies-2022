package secondExercise.composicao;

public class Motor {

    Carro carro;
    boolean ligado = false;
        double fatorInjecao = 1; //toda vez que ligado o motor sera jogado esse fator de combustivel

    Motor(Carro carro){
        this.carro = carro;
    }

        int giros() {
            if (!ligado) { //se não estiver ligado
                return 0; //retorna zero
            } else { // se não
                return (int) Math.round(fatorInjecao * 3000); // é injetado maior injecao
            }
        }


}
