package Lab05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lab05main  {
    public static void main(String[] args) {
        Comparator<String> orden = (a, b) -> a.compareTo(b);
        List<String> lista1 = new ArrayList<>(List.of("Yonder","Daniel","Alli"));
        List<String> lista2 = new ArrayList<>(List.of("Ana","Luis","Pepe"));
        List<String> lista3 = new ArrayList<>();

        lista1.sort(orden);
        lista2.sort(orden);
        lista3.sort(orden);

        System.out.println(lista1);
        System.out.println(lista2);
        System.out.println(lista3);
    }
}