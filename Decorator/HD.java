package Decorator;

public class HD extends PlanDecorador{

    public HD(Plan plan){
        super(plan);
    }

    @Override
    public String descripcion(){
        return plan.descripcion() + " + HD";
    }

    @Override
    public int costo(){
        return plan.costo() + 500;
    }
}
