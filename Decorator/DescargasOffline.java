package Decorator;

public class DescargasOffline extends PlanDecorador{

    public DescargasOffline(Plan plan){
        super(plan);
    }

    @Override
    public String descripcion() {
        return plan.descripcion() + " + Descargas Offline";
    }

    @Override
    public int costo() {
        return plan.costo() + 700;
    }
}
