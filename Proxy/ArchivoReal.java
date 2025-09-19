package Proxy;

public class ArchivoReal implements Archivo {
    private String nombre;

    public ArchivoReal(String nombre) {
        this.nombre = nombre;
        cargarDesdeDisco();
    }
    private void cargarDesdeDisco(){
        System.out.println("Cargando archivo desde el disco: "+nombre);
    }

    @Override
    public boolean leer(String usuario) {
        System.out.println("El usuario: "+usuario+" está abriendo el archivo: "+nombre);
        return false;
    }
}
