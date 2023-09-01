package yourturn8pizzacomplete;

public interface IBaker {
    public PizzaOrder getNextOrderToPrepare();
    
    public void completeOrder (PizzaOrder pizzaOrder);
}
