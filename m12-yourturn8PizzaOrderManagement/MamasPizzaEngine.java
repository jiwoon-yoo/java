package yourturn8pizzacomplete;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MamasPizzaEngine {

    Queue<PizzaOrder> pendingQueue = new LinkedList<>();
    PizzaOrder orderBeingPrepared;
    ArrayList<PizzaOrder> pizzaOrdersWaitingForPickup = new ArrayList<>();

    public PizzaOrder submitOrder(PizzaOrder order) {
        pendingQueue.offer(order);
        return order;
    }

    public PizzaOrder getNextOrderToPrepare() {
        if (pendingQueue.isEmpty()) {
            return null;
        }
        pendingQueue.peek().setStatus(OrderStatus.PREPARING);
        orderBeingPrepared = pendingQueue.peek();
        return pendingQueue.poll();
    }

    public String getCurrentStatus() {
        String returnValue = "Mama's Pizza Status\n\nPending Queue:\n";
        for (PizzaOrder pizzaOrder : pendingQueue) {
            returnValue += pizzaOrder.toString();
        }
        returnValue += "\nCurrent Order:\n";
        returnValue += (orderBeingPrepared == null) ? "No Orders currently being prepared\n"
                : orderBeingPrepared.toString() + "\n";

        returnValue += "Waiting For Pickup: \n";
        for (PizzaOrder pizzaOrder : pizzaOrdersWaitingForPickup) {
            returnValue += pizzaOrder.toString();
        }

        return returnValue;
    }

    public PizzaOrder completeOrderBeingPrepared() {
        PizzaOrder currentOrder = this.orderBeingPrepared;
        if (currentOrder==null) {
            return null;
        }
        currentOrder.setStatus(OrderStatus.COMPLETE);
        this.pizzaOrdersWaitingForPickup.add(orderBeingPrepared);
        this.orderBeingPrepared = null;
        return currentOrder;
    }

    public PizzaOrder customerPickup(String name) {
        PizzaOrder returnValue = null;
        for (PizzaOrder pizzaOrder : pizzaOrdersWaitingForPickup) {
            if (pizzaOrder.getCustomer().getName().equals(name)) {
                pizzaOrdersWaitingForPickup.remove(pizzaOrder);
            }
        }
        return null;
    }
}
