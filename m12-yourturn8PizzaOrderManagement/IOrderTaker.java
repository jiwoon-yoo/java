package yourturn8pizzacomplete;

public interface IOrderTaker {
    public PizzaOrder submitOrder(PizzaOrder pizzaOrder);
    
    public PizzaOrder customerPickup(String name);
}
