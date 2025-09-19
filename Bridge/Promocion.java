package Bridge;

public class Promocion extends  Notificacion{

    public Promocion(CanalNotificacion canal){
        super(canal);
    }

    @Override
    public  void enviar(String Mensaje){
        canal.enviar("[Promocion] " + Mensaje);
    }
}
