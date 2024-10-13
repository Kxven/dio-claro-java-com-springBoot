package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio19 {
    //Encontre a soma dos números divisíveis por 3 e 5:
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int somaFizzBuzz = numeros.stream()
                .filter(n -> n % 3 ==0 || n % 5 ==0)
                .mapToInt(Integer::intValue)
               .sum();
        System.out.println(somaFizzBuzz);
    }

}
