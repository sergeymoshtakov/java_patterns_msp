public abstract class PizzaDecorator implements Pizza{
    private Pizza inner;
    public PizzaDecorator(Pizza pizza){
        this.inner = pizza;
    }

    @Override
    public double cost(){
        return inner.cost();
    }

    @Override
    public String description(){
        return inner.description();
    }
}
