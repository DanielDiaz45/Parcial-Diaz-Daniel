package TiendaComestibles;

public class TiendaDeComestibles {
    private double total;
    private static final double DESCUENTO_CARNES_FEEDLOT = 0.15; // Descuento del 15% para feedlot

    public TiendaDeComestibles() {
        total = 0;
    }

    public void agregarProducto(Producto producto) {
        total += producto.calcularPrecioConDescuento();
    }

    public double calcularTotal() {
        return total;
    }

    public void mostrarDetalleCompra() {
        System.out.println("Detalle de la Compra:");
        System.out.println("Total: $" + calcularTotal());
    }

    // Aplicar descuento específico para carne de feedlot
    public void aplicarDescuentoCarneFeedlot(Producto producto) {
        if (producto.getNombre().equals("Carne de Feedlot")) {
            producto.setPrecio(producto.getPrecio() * (1 - DESCUENTO_CARNES_FEEDLOT));
        }
    }
}

