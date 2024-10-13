package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio17 {
    //filtre os números primos da lista e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosPrimos = numeros.stream()
                .filter(Desafio17::isPrimo)
                .collect(Collectors.toList());
        System.out.println(numerosPrimos);
    }
    public static boolean isPrimo(int n){
        if (n<= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n% i == 0) {
                return false;
            }
        }
        return true;
    }

}


