public class PepperoniDecorator extends PizzaDecorator{
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public double cost(){
        return super.cost() + 2.0;
    }
    @Override
    public String description(){
        return super.description() + ", Pepperoni";
    }
}
