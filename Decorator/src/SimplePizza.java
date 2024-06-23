public class SimplePizza implements Pizza{
    @Override
    public double cost() {
        return 10.2;
    }

    @Override
    public String description() {
        return "Pizza";
    }
}
