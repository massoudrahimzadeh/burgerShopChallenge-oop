package com.company;

public class BaseBurger extends Hamburger{

    public BaseBurger( String rollType, String meat) {
        super( "Burger of your choice", 3.65, rollType, meat);
    }
    int count =0;

    @Override
    public double addAdditions(AdditionalItem item) {
        double price = getPrice();
        if(this.count <= 3){
            price += item.getPrice();
            System.out.println(item.getName() + " was added to the burger for " + item.getPrice() + " total bill is: " + price);
            setPrice(price);
            this.count+=1;
        }else {
            System.out.println("You have chosen 4 additions and there is no more place in your burger for more!");
        }
        return price;
    }
}

