package Lab01;

import java.util.function.Consumer;

public class Lab01main {
    public static void main(String[] args) {
        Consumer<String> mensaje =  nombre -> System.out.println("El pedido esta listo " + nombre);
        String[] clientes = {"Yonder","Daniel","Maldonado"};
        for (String i: clientes) {
            mensaje.accept(i);
        }
    }
};
/* el consumer solo funciona para realivar una accion pero no devuelve nada */