package yourturn8pizzacomplete;

public class Employee implements IBaker,IOrderTaker {

    private MamasPizzaEngine mamas;

    public Employee(MamasPizzaEngine mamas) {
        this.mamas = mamas;
    }

    @Override
    public void completeOrder(PizzaOrder pizzaOrder) {
        mamas.completeOrderBeingPrepared();
        
    }

    @Override
    public PizzaOrder submitOrder(PizzaOrder pizzaOrder) {
       
    	return mamas.submitOrder(pizzaOrder);
    }

    @Override
    public PizzaOrder getNextOrderToPrepare() {
       return mamas.getNextOrderToPrepare();
    }

    @Override
    public PizzaOrder customerPickup(String name) {
        return mamas.customerPickup(name);
    }
    
}
