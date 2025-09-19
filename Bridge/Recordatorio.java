package Bridge;

public class Recordatorio extends Notificacion {

    public Recordatorio(CanalNotificacion canal){
        super(canal);
    }

    @Override
    public  void enviar(String Mensaje){
        canal.enviar("[Recordatorio] " + Mensaje);
    }
}
