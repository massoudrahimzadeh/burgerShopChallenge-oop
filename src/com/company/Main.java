package com.company;

public class Main {

    public static void main(String[] args) {
        BaseBurger bb = new BaseBurger("dark", "Ham");
        bb.addAdditions(bb.getTomato());
        bb.addAdditions(bb.getChipsAndDrink());
        bb.addAdditions(bb.getCucumber());
        DeluxeBurger db = new DeluxeBurger("rye", "beef");
        db.addAdditions(bb.getCarrot());

    }
}
