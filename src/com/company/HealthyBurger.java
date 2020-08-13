package com.company;

public class HealthyBurger extends Hamburger{
    private AdditionalItem healthy1 = new AdditionalItem("healthy1", 0.80);
    private AdditionalItem healthy2 = new AdditionalItem("healthy2", 1.30);

    public HealthyBurger( double price, String meat) {
        super("Healthy Burger", price, "Brown Rye", meat);
    }
    int count =0;

    @Override
    public double addAdditions(AdditionalItem item) {
        double price = getPrice();
        if(this.count <= 5){
            price += item.getPrice();
            System.out.println(item.getName() + " was added to the burger for " + item.getPrice() + " total bill is: " + price);
            setPrice(price);
            this.count+=1;
        }else {
            System.out.println("You have chosen 6 additions and there is no more place in your burger for more!");
        }
        return price;
    }
}
