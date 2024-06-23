public class OliveDecorator extends PizzaDecorator{
    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public double cost(){
        return super.cost() + 3.0;
    }
    @Override
    public String description(){
        return super.description() + ", Olives";
    }
}
