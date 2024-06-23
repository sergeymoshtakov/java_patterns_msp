public class Main {
    public static void main(String[] args) {
        Pizza sp = new SimplePizza();
        System.out.println(sp.description()+" : "+sp.cost());
        sp = new CheeseDecorator(sp);
        System.out.println(sp.description()+" : "+sp.cost());
        sp = new OliveDecorator(sp);
        System.out.println(sp.description()+" : "+sp.cost());
        sp = new PepperoniDecorator(sp);
        System.out.println(sp.description()+" : "+sp.cost());
    }
}