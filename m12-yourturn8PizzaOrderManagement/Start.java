package yourturn8pizzacomplete;

public class Start {
    public static void main(String[] args) {
        MamasPizzaEngine mama = new MamasPizzaEngine();

        IOrderTaker orderTaker = new Employee(mama);
        IBaker baker = new Employee(mama);

        Customer c1 = new Customer("Rich", "555-5555", "Crazy Street");
        PizzaOrder o1 = new PizzaOrder(c1, Size.LARGE);
        o1.addTopping(Toppings.CHEESE);
        o1.addTopping(Toppings.EXTRAPINEAPPLE);
        mama.submitOrder(o1);

        Customer c2 = new Customer("Lori", "555-5655", "Very Crazy Street");
        PizzaOrder o2 = new PizzaOrder(c2, Size.LARGE);
        o2.addTopping(Toppings.EXTRACHEESE);
        o2.addTopping(Toppings.EXTRAPINEAPPLE);
        System.out.println("Submitting new order for " + orderTaker.submitOrder(o2)
                .getCustomer().getName());
        
        Customer c3 = new Customer("Liz", "555-5555", "Jazzy Street");
        PizzaOrder o3 = new PizzaOrder(c3, Size.SMALL);
        o3.addTopping(Toppings.CHEESE);
        o3.addTopping(Toppings.PINEAPPLE);
        System.out.println("Submitting new order for " + orderTaker.submitOrder(o3)
                .getCustomer().getName());

        Customer c4 = new Customer("Samar", "455-5545", "More Crazy Street");
        PizzaOrder o4 = new PizzaOrder(c4, Size.MEDIUM);
        o4.addTopping(Toppings.CHEESE);
        System.out.println("Submitting new order for " + orderTaker.submitOrder(o4)
        .getCustomer().getName());

        Customer c5 = new Customer("Aiko", "555-5555", "Crazy Street");
        PizzaOrder o5 = new PizzaOrder(c5, Size.SMALL);
        o5.addTopping(Toppings.EXTRACHEESE);
        System.out.println("Submitting new order for " + orderTaker.submitOrder(o5)
                .getCustomer().getName());

        System.out.println ("Chef is now preparing "+ baker.getNextOrderToPrepare().getCustomer().getName()+" order");
        System.out.println (mama.completeOrderBeingPrepared().getCustomer().getName()+" order is now complete and being moved to Awaiting Pickup");
        System.out.println ("Chef is now preparing "+ baker.getNextOrderToPrepare().getCustomer().getName()+" order");
        System.out.println (mama.completeOrderBeingPrepared().getCustomer().getName()+" order is now complete and being moved to Awaiting Pickup");
        System.out.println("Chef is now preparing " + baker.getNextOrderToPrepare().getCustomer().getName() + " order");
        
        System.out.println(mama.getCurrentStatus());

    }
}
