package com.company;

public class Hamburger {
    private  String  name;
    private double price;
    private String rollType;
    private String meat;
    private AdditionalItem cucumber = new AdditionalItem("Cucumber", 0.25);
    private AdditionalItem jalapeno = new AdditionalItem("Jalapeno", 0.70);
    private AdditionalItem carrot = new AdditionalItem("Carrot", 0.15);
    private AdditionalItem tomato = new AdditionalItem("Tomato", 0.25);
    private AdditionalItem chipsAndDrink = new AdditionalItem("Chips and drink", 2.50);


    public Hamburger(String name, double price, String rollType, String meat) {
        this.name = name;
        this.price = price;
        this.rollType = rollType;
        this.meat = meat;

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public AdditionalItem getCucumber() {
        return cucumber;
    }

    public AdditionalItem getJalapeno() {
        return jalapeno;
    }

    public AdditionalItem getCarrot() {
        return carrot;
    }

    public AdditionalItem getTomato() {
        return tomato;
    }

    public AdditionalItem getChipsAndDrink() {
        return chipsAndDrink;
    }



    public double addAdditions(AdditionalItem item){
        double total = this.price + item.getPrice();
        setPrice(total);
        return total;
    }

}
