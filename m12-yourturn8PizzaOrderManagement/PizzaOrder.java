package yourturn8pizzacomplete;

import java.util.ArrayList;

public class PizzaOrder {
    private Customer customer;
    private Size size;
    private ArrayList<Toppings> toppings = new ArrayList<>();
    private OrderStatus status;

    public PizzaOrder(Customer customer, Size size) {
        this.customer = customer;
        this.size = size;
        this.status = OrderStatus.PENDING;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Size getSize() {
        return size;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addTopping (Toppings topping)
    {
        this.toppings.add(topping);
    }

    @Override
    public String toString ()
    {
        String returnValue = String.format("%-20s%-20s%-20s", customer.getName(), customer.getPhone(),
                customer.getAddress());
                for (Toppings topping : toppings) {
                    returnValue += String.format("%-20s", topping);
                }
                return returnValue+"\n";
    }

}