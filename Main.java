import Adapter.Impresora;
import Adapter.ImpresoraPDF;
import Adapter.ImpresoraTexto;
import Adapter.ImpresoraTextoAdapter;
import Bridge.*;
import Decorator.*;
import Facade.Carrito;
import Facade.Envio;
import Facade.Pago;
import Facade.TiendaFacade;
import Flyweight.Arbol;
import Flyweight.FabricaArboles;
import Proxy.Archivo;
import Proxy.ArchivoProxy;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("USO DE ADAPTER");
        // Sistema original con PDF
        Impresora impresoraPdf = new ImpresoraPDF();
        impresoraPdf.imprimir("Contrato laboral");

        // Ahora también puede imprimir en texto plano usando el Adapter
        ImpresoraTexto impresoraTexto = new ImpresoraTexto();
        Impresora impresoraAdaptada = new ImpresoraTextoAdapter(impresoraTexto);
        impresoraAdaptada.imprimir("Factura simple");

        System.out.println("USO DE BRIDGE");
        CanalNotificacion email = new Email();
        CanalNotificacion sms = new SMS();

        Notificacion alerta = new Alerta(email);
        Notificacion recordatorio = new Recordatorio(sms);
        Notificacion promo = new Promocion(email);

        alerta.enviar("El sistema estará en mantenimiento esta noche.");
        recordatorio.enviar("Tenes un turno en el dentista mañana a las 10 AM.");
        promo.enviar("50% de descuento en tu próxima compra!");

        System.out.println("USO DE DECORATOR");
        // Plan básico
        Plan plan1 = new PlanBasico();
        System.out.println(plan1.descripcion() + " → $" + plan1.costo());

        // Plan Básico + HD
        Plan plan2 = new HD(new PlanBasico());
        System.out.println(plan2.descripcion() + " → $" + plan2.costo());

        // Plan Básico + HD + Descargas
        Plan plan3 = new DescargasOffline(new HD(new PlanBasico()));
        System.out.println(plan3.descripcion() + " → $" + plan3.costo());

        // Plan Básico + UltraHD + Descargas
        Plan plan4 = new DescargasOffline(new UltraHD(new PlanBasico()));
        System.out.println(plan4.descripcion() + " → $" + plan4.costo());

        // Plan Básico + HD + UltraHD + Descargas
        Plan plan5 = new DescargasOffline(new UltraHD(new HD(new PlanBasico())));
        System.out.println(plan5.descripcion() + " → $" + plan5.costo());

        System.out.println("USO DE FACADE");
        Carrito carrito=new Carrito();
        Pago pago=new Pago();
        Envio envio=new Envio();
        TiendaFacade tiendaFacade=new TiendaFacade(carrito, envio, pago);
        tiendaFacade.comprar();

        System.out.println("USO DE FLYWEIGHT");
        FabricaArboles fabricaArboles=new FabricaArboles();
        Random random = new Random();
        String[] tipos = {"Roble", "Pino","Arbusto"};
        String[] texturas = {"Textura1", "Textura2"};
        String[] colores = {"Verde claro", "Verde oscuro"};
        for (int i = 0; i < 1000000; i++) {
            String tipo = tipos[i% tipos.length];
            String textura = texturas[i% (texturas.length)];
            String color = colores[i%(colores.length)];
            Arbol arbol = fabricaArboles.obtenerArbol(tipo, textura, color);
            int x = random.nextInt(1000);
            int y = random.nextInt(1000);
            // System.out.println("Arbol creado "+i); crea cada arbol
            //arbol.posicionMapa(x, y);
        }
        System.out.println("Se crearon 1000000 árboles usando Flyweight.");
        System.out.println("USO DE PROXY");
        Archivo archivo1= new ArchivoProxy("Trabajo Práctico 2","admin");
        Archivo archivo2=new ArchivoProxy("Horarios","Rocío");
        archivo1.leer("admin");
        archivo2.leer("Rocío");

        System.out.println("USO DE COMPOSITE");
        // Platos individuales
        compocite.ElementoMenu plato1 = new compocite.Plato("Milanesa con papas", 2500);
        compocite.ElementoMenu plato2 = new compocite.Plato("Ensalada César", 1800);
        compocite.ElementoMenu plato3 = new compocite.Plato("Pizza muzzarella", 2200);
        compocite.ElementoMenu plato4 = new compocite.Plato("Helado", 900);

        // Submenú de postres
        compocite.Menu postres = new compocite.Menu("Postres");
        postres.agregar(plato4);

        // Menú principal
        compocite.Menu menuPrincipal = new compocite.Menu("Menú del Día");
        menuPrincipal.agregar(plato1);
        menuPrincipal.agregar(plato2);
        menuPrincipal.agregar(plato3);
        menuPrincipal.agregar(postres); // un submenú dentro del menú principal

        // Mostrartodo
        menuPrincipal.mostrar("");


    }
}
