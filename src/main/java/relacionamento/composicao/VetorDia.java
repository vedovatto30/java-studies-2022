package relacionamento.composicao;

import java.util.Arrays;

public class VetorDia {



    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abri", "Mai", "Jun", "Jul", "Set", "Out", "Nov", "Dez"};

        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < mes.length; i++){
            System.out.println(mes[i] + "tem " + tot[i] + " dias");



        }
    }
}
