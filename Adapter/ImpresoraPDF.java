package Adapter;

public class ImpresoraPDF implements Impresora {
    @Override
        public void imprimir(String texto){
            System.out.println("Imprimir en PDF: " +texto);
        }
    
}
