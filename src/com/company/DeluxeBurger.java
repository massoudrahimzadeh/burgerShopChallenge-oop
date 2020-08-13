package com.company;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger(String rollType, String meat) {
        super("Deluxe Burger", 7.50, rollType, meat);
        double total = addAdditions(getChipsAndDrink());
        System.out.println("The deluxe burger price is: "+ getPrice() + " and chips and drink was added for: "+ getChipsAndDrink().getPrice() + " the total bill is: " + total);
    }
    int count  = 0;
    @Override
    public double addAdditions(AdditionalItem item) {

        if(count == 0){
            double total = this.getPrice() + item.getPrice();
            count+=1;
            setPrice(total);
            return total;
        }else {
            System.out.println("you cannot add any other item to the deluxe menu");
        }
        return super.addAdditions(getChipsAndDrink());
    }

}
