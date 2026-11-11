package Lab00;

import java.util.function.Predicate;

public class Lab00main {
    public static void main(String[] args) {
        Predicate<Integer> puedeEntrar = edad -> edad >= 15;
        int[] personas = {12,15,17};
        for (int i : personas) {
            System.out.println("La persona "+ i +" puede entrar: " + puedeEntrar.test(i));
        }
    }
};
/* utilize predicate porque solo necesitaba colocar una regla y un resultado boolean */