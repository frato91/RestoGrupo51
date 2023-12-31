package restogrupo51.entidades;

public class PedidoProducto {

    private int idPedidoProducto;
    private Pedido pedido;
    private Producto producto;
    private int cantidad;

    public PedidoProducto() {
    }

    public PedidoProducto(Pedido pedido, Producto producto, int cantidad) {
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public PedidoProducto(int idPedidoProducto, Pedido pedido, Producto producto, int cantidad) {
        this.idPedidoProducto = idPedidoProducto;
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getIdPedidoProducto() {
        return idPedidoProducto;
    }

    public void setIdPedidoProducto(int idPedidoProducto) {
        this.idPedidoProducto = idPedidoProducto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "ID: " + idPedidoProducto + ", Pedido: " + pedido + ", Producto: " + producto + ", Cantidad: " + cantidad;
    }

}
