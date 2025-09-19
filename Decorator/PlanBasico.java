package Decorator;

public class PlanBasico implements  Plan{
    @Override
    public  String descripcion(){
        return "Plan básico";
    }
    @Override
    public int costo(){
        return 1000;
    }
}
