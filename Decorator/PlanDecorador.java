package Decorator;

abstract class PlanDecorador implements Plan{
    protected Plan plan;

    public PlanDecorador(Plan plan){
        this.plan = plan;
    }

    @Override
    public String descripcion(){
        return plan.descripcion();
    }

    @Override
    public int costo(){
        return plan.costo();
    }
}
