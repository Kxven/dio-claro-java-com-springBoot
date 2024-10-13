package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio5 {
    //Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int medMaioresQue5 = numeros.stream()
                .filter(n ->  n > 5 )
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(medMaioresQue5);
        System.out.println(6+7+8+9+10);
    }
}
