package Flyweight;

public class ArbolConcreto implements Arbol {
    //propiedades intrínsecas
    private final String tipo;
    private final String textura;
    private final String color;

    public ArbolConcreto(String tipo, String textura, String color) {
        this.tipo = tipo;
        this.textura = textura;
        this.color = color;
        System.out.println("Creando arbol para el tipo: "+tipo+" con textura: "+textura+" color: "+color);
    }

    @Override
    public void posicionMapa(int x, int y) {
        System.out.println("Posicionando árbol "+tipo+", "+textura+", "+color+" en posicion '"+x+"' + '"+y+"'");

    }
}
