package Bridge;

public class Alerta extends Notificacion{
    public  Alerta(CanalNotificacion canal){
        super(canal);
    }
    @Override
        public void enviar(String Mensaje){
        canal.enviar("[ALERTA]" + Mensaje);
    }
}
