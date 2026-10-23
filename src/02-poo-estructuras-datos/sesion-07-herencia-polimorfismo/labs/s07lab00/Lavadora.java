package s07lab00;

// TODO 1: Hacer que Lavadora herede de Electrodomestico.
public class Lavadora extends Electrodomestico{
    private int capacidadKg;

    public Lavadora(String marca, int capacidadKg) {
        super(marca);
        this.capacidadKg = capacidadKg;
        // TODO 2: Invocar super(marca) primero y guardar capacidadKg con this.
    }

    public String ficha() {
        // TODO 3: Devolver la ficha usando describirMarca() y capacidadKg.
        return describirMarca(); // Retorno provisional: reemplazar.
    }
}
