package TiendaComestibles;

public class GestionTiendaComestibles {
    public static void main(String[] args) {
        TiendaDeComestibles tienda = new TiendaDeComestibles();

        // Crear productos
        Producto producto1 = new Producto("Vegetales Gral", 2300);
        Producto producto2 = new Producto("Carne Pastura x KG", 7300);
        Producto producto3 = new Producto("Carne Feedlot x KG", 5700);
        Producto producto4 = new Producto("Vegetales de Estación", 1600);

        // Agregar productos a la tienda
        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarProducto(producto3);
        tienda.agregarProducto(producto4);

        
        tienda.aplicarDescuentoCarneFeedlot(producto3);
        tienda.mostrarDetalleCompra();
    }
}
