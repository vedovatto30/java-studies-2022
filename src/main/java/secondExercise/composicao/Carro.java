package secondExercise.composicao;

public class Carro {

    Motor motor;

    Carro(){
        this.motor = new Motor(this); //agora um carro tem um motor e um motor tem um carro
    }

    //metodo
    void acelerar(){
        motor.fatorInjecao += 0.4; //ao toque em acelerar o motor aumentara o fatorInjeçao em 0.4
    }

    void frear(){
        motor.fatorInjecao -= 0.4;
    }

    void ligar(){
        motor.ligado = true;
    }

    void desligado(){
        motor.ligado = false;
    }

    boolean estaLigado(){
        return motor.ligado;
    }
}
