package Bridge;

public class SMS implements CanalNotificacion{

    @Override
    public void enviar(String Mensaje){

        System.out.println("Enviando SMS: " + Mensaje);
    }
}
