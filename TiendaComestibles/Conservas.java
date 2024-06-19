package TiendaComestibles;

public class Conservas extends Producto {
    
    public Conservas(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double calcularPrecioConDescuento() {
        double descuento = 0.10;
        return getPrecio() * (1 - descuento);
    }
}
