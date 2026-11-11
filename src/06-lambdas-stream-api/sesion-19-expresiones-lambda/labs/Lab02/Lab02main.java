package Lab02;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Lab02main{
    public static void main(String[] args) {
        Supplier<String> horario = () -> "Horario de atencion 8:00 a 17:00";
        System.out.println("primera: " + horario.get());
        System.out.println("segunda: " + horario.get());
        System.out.println("tercera: " + horario.get());

    }
};
/*al obtener lo estamos guardando en una variable*/