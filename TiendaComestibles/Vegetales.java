package TiendaComestibles;

public class Vegetales extends Producto {

    boolean esDeEstacion;

    Vegetales(String nombre, double precio, boolean esDeEstacion) {
        super(nombre, precio);
        this.esDeEstacion = esDeEstacion;
    }

    @Override
    public double calcularPrecioConDescuento() {
        double descuento;
        if (esDeEstacion) {
            descuento = 0.15;
        } else {
            descuento = 0.05;
        }
        return precio * (1 - descuento);
    }
}
