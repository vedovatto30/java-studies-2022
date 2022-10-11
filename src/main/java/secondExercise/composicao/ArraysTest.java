package secondExercise.composicao;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int num[] = {3, 5, 1, 8, 4};
        for (int valor: num){
            System.out.println(valor);
        }
        System.out.println("----");
        Arrays.sort(num);

        for (int valor: num){
            System.out.println(valor);
        }

        int pos = Arrays.binarySearch(num, 1);
        System.out.println("pos: " + pos);
    }
}
