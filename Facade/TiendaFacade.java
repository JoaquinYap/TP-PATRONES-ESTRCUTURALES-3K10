package Facade;

public class TiendaFacade {
    private Carrito carrito;
    private Envio envio;
    private Pago pago;

    public TiendaFacade(Carrito carrito,Envio envio,Pago pago) {
        this.carrito = carrito;
        this.envio = envio;
        this.pago = pago;
    }
    public void comprar(){
        System.out.println("Iniciando compra en la tienda...");
        carrito.agregarProducto("remera");
        pago.procesarPago();
        envio.coordinarEnvio();
    }
}
