package Proxy;

public class ArchivoProxy implements Archivo{
    private String nombre;
    private ArchivoReal archivoReal;
    private String usuario;

    public ArchivoProxy(String nombre, String usuario) {//constructor
        this.nombre = nombre;
        this.usuario=usuario;
    }
    private boolean tienePermiso(String usuario){
        return usuario.equalsIgnoreCase("admin");
    }

    @Override
    public boolean leer(String usuario) {
        if (tienePermiso(usuario)){
            if (archivoReal==null) {
                archivoReal = new ArchivoReal(nombre);// se carga solo si es la primera vez
            }
            archivoReal.leer(usuario);
        }
        else {
            System.out.println("El usuario: "+usuario+" no tiene acceso a el archivo: "+nombre);
        }


        return false;
    }
}
