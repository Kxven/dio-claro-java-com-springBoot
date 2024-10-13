package Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Desafio9 {
    //verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean semDuplicados = numeros.stream()
                .collect(Collectors.toSet())
                .size() == numeros.size();
        System.out.println(semDuplicados);
    }
}
