public abstract class Pizza{
    private String name = "Pizza";
    String description = "This is a Pizza.";

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public abstract int getCost();
        

}

class PeppyPaneer extends Pizza{

    public PeppyPaneer(){
        description = "This is the Peppy Paneer pizza ";
    }

    public int getCost(){
        return 500;
    }

}

class FarmHouse extends Pizza{

    public FarmHouse(){
        description = "This is the Farm House pizza ";
    }

    public int getCost(){
        return 600;
    }

}

class Margherita extends Pizza{

    public Margherita(){
        description = "This is the Margherita pizza ";
    }

    public int getCost(){
        return 700;
    }

}

class ChickenFiesta extends Pizza{

    public ChickenFiesta(){
        description = "This is the Chicken Fiesta pizza ";
    }

    public int getCost(){
        return 800;
    }

}

abstract class ToppingDecorator extends Pizza{
    public abstract String getDescription();
}

class FreshTomato extends ToppingDecorator{
    Pizza pizza;

    public FreshTomato(Pizza pizza){
        this.pizza=pizza;
    }

    public String getDescription(){
        return pizza.getDescription() + "Added Fresh Tomato topping ";
    }

    public int getCost(){
        return pizza.getCost()+100;
    }

}

class Paneer extends ToppingDecorator{
    Pizza pizza;

    public Paneer(Pizza pizza){
        this.pizza=pizza;
    }

    public String getDescription(){
        return pizza.getDescription() + "Added Paneer topping ";
    }

    public int getCost(){
        return pizza.getCost()+200;
    }

}

class Jalapeno extends ToppingDecorator{
    Pizza pizza;

    public Jalapeno(Pizza pizza){
        this.pizza=pizza;
    }

    public String getDescription(){
        return pizza.getDescription() + "Added Jalapeno topping ";
    }

    public int getCost(){
        return pizza.getCost()+150;
    }

}
class Barbeque extends ToppingDecorator{
    Pizza pizza;

    public Barbeque(Pizza pizza){
        this.pizza=pizza;
    }

    public String getDescription(){
        return pizza.getDescription() + "Added Barbeque topping ";
    }

    public int getCost(){
        return pizza.getCost()+80;
    }

}

class PizzaDemo{
    public static void main(String args[]){
        //farmhouse pizza without any toppings
        Pizza pizza = new FarmHouse();
        System.out.println( "Description = " + pizza.getDescription()+ ", Total Cost = " + pizza.getCost() );

        //farmhouse pizza with paneer and barbeque toppings
        Pizza pizzaWToppings = new FarmHouse();
        pizzaWToppings = new Paneer(pizzaWToppings);
        pizzaWToppings = new Barbeque(pizzaWToppings);
        System.out.println( "Description = " + pizzaWToppings.getDescription()+ ", Total Cost = " + pizzaWToppings.getCost() );

        //Chicken Fiesta pizza with all toppings
        Pizza allToppings = new ChickenFiesta();
        allToppings = new FreshTomato(allToppings);
        allToppings = new Jalapeno(allToppings);
        allToppings = new Paneer(allToppings);
        allToppings = new Barbeque(allToppings);
        System.out.println( "Description = " + allToppings.getDescription()+ ", Total Cost = " + allToppings.getCost() );

        




    }
}
