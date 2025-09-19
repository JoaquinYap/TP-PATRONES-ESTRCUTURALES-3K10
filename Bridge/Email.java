package Bridge;

public class Email implements CanalNotificacion{

    @Override

        public void enviar(String Mensaje){
        System.out.println("Enviando Email: " + Mensaje);
    }
}
