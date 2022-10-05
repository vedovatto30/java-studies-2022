package relacionamento.composicao;

public class CarroTeste {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        System.out.println("Carro esta ligado ?" + c1.estaLigado()); //verificando se o carro esta ligado

        c1.ligar(); //ligando o carro
        System.out.println("Carro esta ligado ?" + c1.estaLigado()); //verificando

        System.out.println(c1.motor.giros()); //verificando a velocidade do c1

        if(c1.estaLigado()) {
            c1.acelerar();
        }

        System.out.println(c1.motor.giros()); //verificando a velocidade do carro

        c1.frear();

        System.out.println(c1.motor.carro.motor.giros());
    }


}
