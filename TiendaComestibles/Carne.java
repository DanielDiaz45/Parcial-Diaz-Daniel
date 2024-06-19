package TiendaComestibles;

public class Carne extends Producto {
    String tipo; // "feedlot" o "pastura"

    Carne(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    public double calcularPrecioConDescuento()  {
        double descuento;
        if (tipo.equals("pastura")) {
            descuento = 0.05;
        } else {
            descuento = 0.10;
        }
        return precio * (1 - descuento);
    }
}
