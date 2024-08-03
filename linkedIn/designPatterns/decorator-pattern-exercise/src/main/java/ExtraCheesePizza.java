import java.util.ArrayList;

public class ExtraCheesePizza implements Pizza {

    private final Pizza basicPizza;

    public ExtraCheesePizza(Pizza pizza) {
        basicPizza = pizza;
    }


    @Override
    public ArrayList getToppings() {
        ArrayList newToppings = new ArrayList(basicPizza.getToppings());
        newToppings.add("cheese");
        basicPizza.getToppings().clear();
        return newToppings;
    }

    @Override
    public String getName() {
        return basicPizza.getName() + " extra cheese";
    }
}
