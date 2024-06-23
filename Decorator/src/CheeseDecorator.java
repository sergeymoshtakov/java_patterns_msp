public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double cost(){
        return super.cost() + 1.0;
    }
    @Override
    public String description(){
        return super.description() + ", Cheese";
    }
}
