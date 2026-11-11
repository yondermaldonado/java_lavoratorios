package Lab04;

import java.util.function.BiFunction;

public class Lab04main{
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> minutosUtilizados = (contratados, utilizados) -> contratados - utilizados;
        System.out.println("contratados 120 y 45 utilizados: " + minutosUtilizados.apply(120, 45));
        System.out.println("contratados 120 y 0 utilizados: " + minutosUtilizados.apply(120, 0));
        System.out.println("contratados 120 y 120 utilizados: " + minutosUtilizados.apply(120, 120));
    }
};
/* bifuncion funciona con 2 argumentos */