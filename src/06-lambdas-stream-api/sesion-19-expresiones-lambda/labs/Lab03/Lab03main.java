package Lab03;

import java.util.function.Function;

public class Lab03main{
    public static void main(String[] args) {
        Function<Integer, Double> transformador = gramos -> gramos /1000.0;
        int[] pesos = {100,400,700,1000,3000};
        for (int peso : pesos){
            System.out.println("resultado en gramos: " + peso);
        }
        for (int peso : pesos){
            System.out.println("resultado en kilos: " + transformador.apply(peso));
        }
    }
};
/* se debe devolver para que funcione pero tambien para poder hacer diferentes calculos despues */